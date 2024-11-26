/* import React, { useState } from 'react';
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

export default UserManagement;*/

import React, { useState } from 'react';
import './UserManagement.css'; // Add styles as needed

function UserManagement() {
  const [userData, setUserData] = useState({
    userId: '',
    firstName: '',
    lastName: '',
    email: '',
  });
  const [feedbackMessage, setFeedbackMessage] = useState('');
  const [isError, setIsError] = useState(false);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setUserData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleCreateUser = async () => {
    try {
      const response = await fetch('http://localhost:8081/api/v1/users', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
      });

      if (response.ok) {
        const data = await response.json();
        console.log('Create User Successful:', data);
        setFeedbackMessage('User created successfully!');
        setIsError(false);
      } else {
        console.error('Failed to create user:', response.statusText);
        setFeedbackMessage('Failed to create user.');
        setIsError(true);
      }
    } catch (error) {
      console.error('Error creating user:', error);
      setFeedbackMessage('Error creating user.');
      setIsError(true);
    }
  };

  return (
    <div className="user-management-container">
      <h2>User Management</h2>
      <div className="user-form">
        <label>
          User ID:
          <input
            type="text"
            name="userId"
            value={userData.userId}
            onChange={handleInputChange}
          />
        </label>
        <label>
          First Name:
          <input
            type="text"
            name="firstName"
            value={userData.firstName}
            onChange={handleInputChange}
          />
        </label>
        <label>
          Last Name:
          <input
            type="text"
            name="lastName"
            value={userData.lastName}
            onChange={handleInputChange}
          />
        </label>
        <label>
          Email:
          <input
            type="email"
            name="email"
            value={userData.email}
            onChange={handleInputChange}
          />
        </label>
        <button onClick={handleCreateUser}>Create User</button>
      </div>
      {feedbackMessage && (
        <div className={`feedback-message ${isError ? 'error' : 'success'}`}>
          {feedbackMessage}
        </div>
      )}
    </div>
  );
}

export default UserManagement;
