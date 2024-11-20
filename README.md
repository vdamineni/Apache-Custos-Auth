Apache Custos Auth System
This project provides an end-to-end authentication system using Apache Custos, integrating both frontend and backend components. It facilitates secure user login, role-based access control, and group management functionalities.
________________________________________
Table of Contents
•	Features
•	Technologies Used
•	Folder Structure
•	Setup and Installation
•	Usage
•	Environment Variables
•	API Documentation
•	Development Notes
________________________________________
Features
1.	Authentication:
o	Secure login via Apache Custos.
o	Role-based testing login functionality.
2.	User Management:
o	Create and retrieve user profiles.
o	Role-based access for users (Admin, Doctor, Patient).
3.	Group Management:
o	Create and manage groups.
o	Retrieve group details.
4.	Frontend:
o	React-based UI for login and dashboard.
o	Interactive components for user and group management.
5.	Backend:
o	gRPC-based backend to handle user and group-related operations.
o	REST APIs for communication with the frontend.
________________________________________
Technologies Used
Backend:
•	Node.js
•	Express.js
•	gRPC
•	Apache Custos API
•	axios for REST requests
Frontend:
•	React
•	React Router DOM
•	grpc-web
•	axios for API calls
________________________________________
Folder Structure
bash
Copy code
Apache-Custos-Auth/
├── custos-auth-backend/   # Backend codebase
│   ├── node_modules/
│   ├── proto/             # gRPC Protobuf files
│   ├── src/
│   ├── server.js          # Main backend server script
│   └── .env               # Environment variables for backend
├── custos-auth-frontend/  # Frontend codebase
│   ├── src/
│   │   ├── components/    # React components (UserForm, GroupForm, etc.)
│   │   ├── Login.js       # Login component
│   │   ├── Logout.js      # Logout component
│   │   ├── Dashboard.js   # Dashboard page
│   │   ├── utils/         # Utility files
│   ├── public/
│   └── .env               # Environment variables for frontend
└── README.md
________________________________________
Setup and Installation
Prerequisites
•	Node.js installed (version >= 16.x)
•	npm or yarn
•	Apache Custos tenant configured with proper client ID and redirect URI.
Steps to Run Locally
Backend
1.	Navigate to the backend directory:
bash
Copy code
cd custos-auth-backend
2.	Install dependencies:
bash
Copy code
npm install
3.	Configure .env file with required values:
bash
Copy code
CUSTOS_BASE_URL=https://api.playground.usecustos.org
CLIENT_ID=<your-client-id>
REDIRECT_URI=http://localhost:8082/callback
4.	Start the backend server:
bash
Copy code
node server.js
Frontend
1.	Navigate to the frontend directory:
bash
Copy code
cd custos-auth-frontend
2.	Install dependencies:
bash
Copy code
npm install
3.	Configure .env file with the backend URL:
arduino
Copy code
REACT_APP_API_BASE_URL=http://localhost:8082
4.	Start the frontend server:
bash
Copy code
npm start
5.	Open the app in your browser:
o	Frontend: http://localhost:3000
o	Backend: http://localhost:8082
________________________________________
Usage
Login
1.	Use the Login page to authenticate via Apache Custos.
2.	Select roles (Admin, Doctor, Patient) for testing purposes.
Dashboard
1.	Access user and group management functionalities.
2.	Create and manage users or groups.
________________________________________
Environment Variables
Backend (custos-auth-backend/.env)
env
Copy code
CUSTOS_BASE_URL=https://api.playground.usecustos.org
CLIENT_ID=<your-client-id>
REDIRECT_URI=http://localhost:8082/callback
PORT=8082
GRPC_PORT=50051
Frontend (custos-auth-frontend/.env)
env
Copy code
REACT_APP_API_BASE_URL=http://localhost:8082
REACT_APP_CLIENT_ID=<your-client-id>
________________________________________
API Documentation
Backend Endpoints
1.	Login:
o	URL: /login
o	Method: GET
2.	Callback:
o	URL: /callback
o	Method: GET
3.	Logout:
o	URL: /logout
o	Method: GET
gRPC Services
•	UserManagementService:
o	CreateUser
o	GetUserById
o	UpdateUser
•	GroupManagementService:
o	CreateGroup
o	GetGroupById
________________________________________
License
This project is licensed under the Apache License 2.0. See the LICENSE file for more details.

