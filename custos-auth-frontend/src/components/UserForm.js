import React, { useState } from 'react';

const UserForm = ({ onSubmit }) => {
  const [formData, setFormData] = useState({
    userId: '',
    firstName: '',
    lastName: '',
    email: ''
  });

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit(formData);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="User ID"
        value={formData.userId}
        onChange={(e) => setFormData({...formData, userId: e.target.value})}
      />
      <button type="submit">Add User</button>
    </form>
  );
};

export default UserForm;
