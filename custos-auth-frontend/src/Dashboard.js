/* import React, { useState, useEffect } from 'react';
import UserManagement from './components/UserManagement';
import GroupManagement from './components/GroupManagement';

function Dashboard() {
  const [userInfo, setUserInfo] = useState(null);
  const [isLoading, setIsLoading] = useState(true);

  // Fetch user data when the component loads
  useEffect(() => {
    const queryParams = new URLSearchParams(window.location.search);
    const name = queryParams.get('name');
    const email = queryParams.get('email');
    const groups = queryParams.get('groups');

    if (name && email && groups) {
      setUserInfo({
        name,
        email,
        groups: JSON.parse(groups), // Parse groups if passed as a JSON string
      });
    }

    setIsLoading(false);
  }, []);

  if (isLoading) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <h1>Dashboard</h1>
      {userInfo ? (
        <div>
          <h2>Welcome, {userInfo.name}</h2>
          <p>Email: {userInfo.email}</p>
          <p>Groups:</p>
          <ul>
            {userInfo.groups.map((group, index) => (
              <li key={index}>{group}</li>
            ))}
          </ul>
        </div>
      ) : (
        <p>User information is not available.</p>
      )}
      <UserManagement />
      <GroupManagement />
    </div>
  );
}

export default Dashboard; */

/* import React, { useState, useEffect } from 'react';
import UserManagement from './components/UserManagement';
import GroupManagement from './components/GroupManagement';
import CompleteProfile from './CompleteProfile'; // Import the profile completion component
import axios from 'axios';

function Dashboard() {
  const [userInfo, setUserInfo] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const [isProfileIncomplete, setIsProfileIncomplete] = useState(false);

  // Fetch user data when the component loads
  useEffect(() => {
    const fetchUserInfo = async () => {
      try {
        // Parse query parameters
        const queryParams = new URLSearchParams(window.location.search);
        const name = queryParams.get('name');
        const email = queryParams.get('email');
        const groups = queryParams.get('groups');

        // If user data exists in query params, set it to state
        if (name && email && groups) {
          const parsedGroups = JSON.parse(groups); // Parse groups if passed as JSON string
          setUserInfo({ name, email, groups: parsedGroups });

          // Check for incomplete profile fields
          if (!name || !email) {
            setIsProfileIncomplete(true);
          }
        } else {
          // Fetch user details from backend (e.g., via REST or gRPC)
          const response = await axios.get(`${process.env.REACT_APP_API_BASE_URL}/user-profile`, {
            headers: {
              Authorization: `Bearer ${localStorage.getItem('access_token')}`, // Pass token if required
            },
          });

          const { name, email, groups } = response.data;
          setUserInfo({ name, email, groups });
          setIsProfileIncomplete(!name || !email);
        }
      } catch (error) {
        console.error('Error fetching user info:', error);
      } finally {
        setIsLoading(false);
      }
    };

    fetchUserInfo();
  }, []);

  if (isLoading) {
    return <div>Loading...</div>;
  }

  // If profile is incomplete, show the profile completion UI
  if (isProfileIncomplete) {
    return (
      <CompleteProfile
        userInfo={userInfo}
        onComplete={(updatedUserInfo) => {
          setUserInfo(updatedUserInfo);
          setIsProfileIncomplete(false);
        }}
      />
    );
  }

  return (
    <div>
      <h1>Dashboard</h1>
      {userInfo ? (
        <div>
          <h2>Welcome, {userInfo.name}</h2>
          <p>Email: {userInfo.email}</p>
          <p>Groups:</p>
          <ul>
            {userInfo.groups.map((group, index) => (
              <li key={index}>{group}</li>
            ))}
          </ul>
        </div>
      ) : (
        <p>User information is not available.</p>
      )}
      <UserManagement />
      <GroupManagement />
    </div>
  );
}

export default Dashboard;*/

import React, { useState, useEffect } from 'react';
import UserManagement from './components/UserManagement';
import GroupManagement from './components/GroupManagement';
import CompleteProfile from './CompleteProfile'; // Import the profile completion component
import axios from 'axios';

function Dashboard() {
  const [userInfo, setUserInfo] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const [isProfileIncomplete, setIsProfileIncomplete] = useState(false);

  // Fetch user data when the component loads
  useEffect(() => {
    const fetchUserInfo = async () => {
      try {
        // Parse query parameters from URL
        const queryParams = new URLSearchParams(window.location.search);
        const name = queryParams.get('name');
        const email = queryParams.get('email');
        const groups = queryParams.get('groups');

        if (name && email) {
          // If user info is available in the query params, set it directly
          const parsedGroups = groups ? JSON.parse(groups) : [];
          setUserInfo({ name, email, groups: parsedGroups });

          // Check if any critical fields are missing
          if (!name || !email) {
            setIsProfileIncomplete(true);
          }
        } else {
          // Otherwise, fetch user data from backend (e.g., REST endpoint)
          const response = await axios.get(`${process.env.REACT_APP_API_BASE_URL}/user-profile`, {
            headers: {
              Authorization: `Bearer ${localStorage.getItem('access_token')}`, // Pass token if required
            },
          });

          const { name, email, groups } = response.data;

          // Update state with fetched user info
          setUserInfo({
            name,
            email,
            groups: groups || [], // Default to empty array if groups are not provided
          });

          // Check for incomplete profile fields
          setIsProfileIncomplete(!name || !email);
        }
      } catch (error) {
        console.error('Error fetching user info:', error);
        alert('Failed to load user data. Please try again.');
      } finally {
        setIsLoading(false);
      }
    };

    fetchUserInfo();
  }, []);

  if (isLoading) {
    return <div>Loading...</div>;
  }

  // If profile is incomplete, show the profile completion UI
  if (isProfileIncomplete) {
    return (
      <CompleteProfile
        userInfo={userInfo}
        onComplete={(updatedUserInfo) => {
          setUserInfo(updatedUserInfo);
          setIsProfileIncomplete(false); // Set profile as complete after update
        }}
      />
    );
  }

  return (
    <div>
      <h1>Dashboard</h1>
      {userInfo ? (
        <div>
          <h2>Welcome, {userInfo.name}</h2>
          <p>Email: {userInfo.email}</p>
          <p>Groups:</p>
          <ul>
            {userInfo.groups.map((group, index) => (
              <li key={index}>{group}</li>
            ))}
          </ul>
        </div>
      ) : (
        <p>User information is not available.</p>
      )}
      {/* Render user and group management components */}
      <UserManagement />
      <GroupManagement />
    </div>
  );
}

export default Dashboard;


