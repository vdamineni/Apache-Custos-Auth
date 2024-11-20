import React, { useState } from 'react';
import UserForm from './UserForm';

const UserManagement = () => {
  const [users, setUsers] = useState([]);

  const handleAddUser = (newUser) => {
    setUsers([...users, newUser]);
  };

  return (
    <div>
      <h2>User Management</h2>
      <UserForm onSubmit={handleAddUser} />
      <ul>
        {users.map((user, index) => (
          <li key={index}>
            {user.firstName} {user.lastName} ({user.email})
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserManagement;
