import React from 'react';
import { logout } from './utils/api';

const Logout = () => {
  const handleLogout = async () => {
    try {
      const result = await logout();
      console.log('Logout successful:', result);
    } catch (error) {
      console.error('Logout failed:', error.message);
    }
  };

  return (
    <div>
      <h1>Logout</h1>
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
};

export default Logout;
