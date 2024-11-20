import React, { useState, useEffect } from 'react';
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

export default Dashboard;
