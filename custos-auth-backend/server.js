// server.js

const path = require('path');
const envPath = path.resolve(__dirname, '.env');
console.log('Loading .env file from:', envPath);
require('dotenv').config({ path: envPath });
console.log('Environment variables loaded:', {
  CUSTOS_BASE_URL: process.env.CUSTOS_BASE_URL,
  CLIENT_ID: process.env.CLIENT_ID,
  REDIRECT_URI: process.env.REDIRECT_URI
});
const express = require('express');
const session = require('express-session');
const crypto = require('crypto');
const axios = require('axios');
const grpc = require('@grpc/grpc-js');
// const reflection = require('grpc-js-reflection');
const protoLoader = require('@grpc/proto-loader');
const cors = require('cors');
const app = express();

// Middleware setup
app.use(express.json());
app.use(cors({
  origin: 'http://localhost:3000', // Allow frontend on localhost:3000
  credentials: true, // Enable cookies
}));
app.use(
  session({
    secret: 'your-secret-key', // Replace with a strong secret in production
    resave: false,
    saveUninitialized: false,
    cookie: { secure: false }, // Set to true if using HTTPS
  })
);



// Custos base URL and client configuration
const custosBaseURL = process.env.CUSTOS_BASE_URL || 'https://api.playground.usecustos.org';
const clientId = process.env.CLIENT_ID; // Your client ID
const redirectUri = process.env.REDIRECT_URI || 'http://localhost:8081/callback'; // Must match exactly with the one registered in Custos


// In-memory data storage for gRPC services
const users = [];
const groups = [];

// Load Protobuf and define gRPC server
const PROTO_PATH = path.join(__dirname, 'proto', 'user_management.proto');
const packageDefinition = protoLoader.loadSync(PROTO_PATH, {
  keepCase: true,
  longs: String,
  enums: String,
  defaults: true,
  oneofs: true,
});
const userManagementProto = grpc.loadPackageDefinition(packageDefinition).org.apache.custos.user;

// gRPC service implementations
const createUserProfile = (call, callback) => {
  const user = call.request;
  users.push(user);
  callback(null, user);
};

const getUserProfile = (call, callback) => {
  const userId = call.request.userId;
  const user = users.find((u) => u.userId === userId);
  if (user) callback(null, user);
  else callback({ code: grpc.status.NOT_FOUND, message: 'User not found' });
};

const createGroup = (call, callback) => {
  const group = call.request;
  groups.push(group);
  callback(null, group);
};

const getGroup = (call, callback) => {
  const groupName = call.request.groupName;
  const group = groups.find((g) => g.name === groupName);
  if (group) callback(null, group);
  else callback({ code: grpc.status.NOT_FOUND, message: 'Group not found' });
};

// Start gRPC server
const grpcServer = new grpc.Server();
grpcServer.addService(userManagementProto.UserManagementService.service, {
  CreateUserProfile: createUserProfile,
  GetUserProfile: getUserProfile,
  CreateGroup: createGroup,
  GetGroup: getGroup,
});

// Enable Reflection API
// const reflectionService = grpc.reflection.getReflectionService;
// grpcServer.addService(reflectionService, grpc.reflection.createReflectionService(PROTO_PATH));

const GRPC_PORT = process.env.GRPC_PORT || 50051;
grpcServer.bindAsync(`0.0.0.0:${GRPC_PORT}`, grpc.ServerCredentials.createInsecure(), (err, port) => {
  if (err) {
    console.error('Failed to bind gRPC server:', err);
    return;
  }
  console.log(`gRPC server is running on port ${GRPC_PORT}`);
  grpcServer.start();
});


// Endpoint to initiate login
app.get('/login', (req, res) => {
  // Generate state parameter and ensure session is initialized
  if (!req.session) {
    return res.status(500).send('Session not initialized');
  }
  
  const state = crypto.randomBytes(16).toString('hex');
  req.session.oauthState = state;

  // Store the selected role from query parameters, if any
  const role = req.query.role;
  if (role) {
    req.session.selectedRole = role;
  }

  // Generate code verifier and code challenge for PKCE
  const codeVerifier = crypto.randomBytes(64).toString('hex');
  const codeChallenge = crypto.createHash('sha256').update(codeVerifier).digest('base64url');
  req.session.codeVerifier = codeVerifier;

  // Construct the authorization URL
  const custosAuthURL =
  `${custosBaseURL}/api/v1/identity-management/authorize` +
  `?response_type=code` +
  `&client_id=${encodeURIComponent(clientId)}` +
  `&redirect_uri=${encodeURIComponent(redirectUri)}` +
  `&scope=${encodeURIComponent('openid profile email offline_access')}` + // Ensure 'offline_access' is included
  `&state=${encodeURIComponent(state)}` +
  `&code_challenge=${encodeURIComponent(codeChallenge)}` +
  `&code_challenge_method=S256`;

  console.log('Client ID being used:', clientId);
  console.log('Authorization Request redirect_uri:', redirectUri);
  console.log('Full authorization URL:', custosAuthURL);

  console.log('Authorization Request redirect_uri:', redirectUri);
  console.log('Redirecting to Custos authorization URL:', custosAuthURL);

  // Redirect the user to the Custos authorization URL
  res.redirect(custosAuthURL);
});

// Callback endpoint to handle Custos response
app.get('/callback', async (req, res) => {
  const { code, state } = req.query;
  const storedState = req.session.oauthState;
  const codeVerifier = req.session.codeVerifier;

  // Verify state parameter
  if (!state || state !== storedState) {
    console.error('State mismatch:', { state, storedState });
    return res.status(400).send('Invalid state parameter');
  }

  // Clear state from session
  delete req.session.oauthState;

  if (!code || !codeVerifier) {
    console.error('Missing code or codeVerifier:', { code, codeVerifier });
    return res.status(400).send('Missing code or code verifier');
  }

  try {
    console.log('Token Request redirect_uri:', redirectUri);

    // Exchange authorization code for access token and refresh token
    const params = new URLSearchParams();
    params.append('grant_type', 'authorization_code');
    params.append('code', code);
    params.append('redirect_uri', redirectUri);
    params.append('client_id', clientId);
    params.append('code_verifier', codeVerifier);

    const tokenResponse = await axios.post(
      `${custosBaseURL}/api/v1/identity-management/token`,
      params,
      {
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded',
        },
      }
    );

    const { access_token, refresh_token } = tokenResponse.data;

    if (!access_token) {
      throw new Error('No access_token received');
    }

    // Store refresh_token in session for later use during logout
    if (refresh_token) {
      req.session.refreshToken = refresh_token;
    } else {
      console.warn('No refresh_token received');
    }

    // Retrieve user info
    const userInfoResponse = await axios.get(`${custosBaseURL}/api/v1/user-management/userinfo`, {
      headers: {
        Authorization: `Bearer ${access_token}`,
      },
    });

    const userInfo = userInfoResponse.data;
    const userId = userInfo.sub; // Assuming 'sub' contains the user ID

    // Check if a selected role was stored in the session
    const selectedRole = req.session.selectedRole;
    // Clear the selected role from the session
    delete req.session.selectedRole;

    let groupNames = [];

    if (selectedRole) {
      // Option 3: Use the selected role for testing
      groupNames = [selectedRole];
    } else {
      // Option 1: Attempt to fetch the user's group memberships
      try {
        const groupMembershipsResponse = await axios.get(
          `${custosBaseURL}/api/v1/group-management/users/${encodeURIComponent(userId)}/group-memberships`,
          {
            headers: {
              Authorization: `Bearer ${access_token}`, // Use user's access token
            },
            params: {
              client_id: clientId,
            },
          }
        );

        const userGroups = groupMembershipsResponse.data.groups || [];
        // Extract group names
        groupNames = userGroups.map((group) => group.name);
      } catch (groupError) {
        console.error(
          'Error fetching group memberships:',
          groupError.response ? groupError.response.data : groupError.message
        );
        // Handle error (e.g., set groupNames to empty array or default value)
        groupNames = [];
      }
    }

    // Pass user info and groups to the frontend
    res.redirect(
      `http://localhost:3000/dashboard` +
        `?name=${encodeURIComponent(userInfo.name)}` +
        `&email=${encodeURIComponent(userInfo.email)}` +
        `&groups=${encodeURIComponent(JSON.stringify(groupNames))}`
    );

  } catch (error) {
    console.error(
      'Authentication error:',
      error.response ? error.response.data : error.message
    );
    res.status(500).send('Authentication failed');
  }
});

// Logout endpoint
app.get('/logout', async (req, res) => {
  const refreshToken = req.session.refreshToken;

  if (refreshToken) {
    try {
      // Revoke the refresh token with Custos
      const logoutResponse = await axios.post(
        `${custosBaseURL}/api/v1/identity-management/user/logout`,
        {
          refresh_token: refreshToken,
        },
        {
          headers: {
            'Content-Type': 'application/json',
          },
        }
      );
      console.log('Refresh token revoked successfully:', logoutResponse.data);
    } catch (error) {
      console.error(
        'Error revoking refresh token:',
        error.response ? error.response.data : error.message
      );
    }
  } else {
    console.warn('No refresh_token found in session.');
  }

  // Destroy the session
  req.session.destroy((err) => {
    if (err) {
      console.error('Error destroying session during logout:', err);
      return res.status(500).send('Unable to logout');
    }
    // Redirect to frontend login page
    res.redirect('http://localhost:3000/');
  });
});

// Start the server
const PORT = process.env.PORT || 8081;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
}).on('error', (err) => {
  if (err.code === 'EADDRINUSE') {
    console.error(`Port ${PORT} is already in use. Please try these solutions:`);
    console.error('1. Stop any other servers running on this port');
    console.error('2. Choose a different port by setting the PORT environment variable');
    process.exit(1);
  } else {
    console.error('Server error:', err);
    process.exit(1);
  }
});
