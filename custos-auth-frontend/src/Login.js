/* import React, { useState } from 'react';
import './Login.css'; // Import the corresponding CSS file

function Login() {
  const [selectedRole, setSelectedRole] = useState('');
  const API_BASE_URL = process.env.REACT_APP_API_BASE_URL || 'http://localhost:8081'; // Dynamically set backend URL
  const CLIENT_ID = process.env.REACT_APP_CLIENT_ID || 'custos-avj2n8708zvqgfw9pexh-10000000'; // Dynamically set client ID

  const handleNormalLogin = () => {
    window.location.href = `${API_BASE_URL}/login?client_id=${encodeURIComponent(CLIENT_ID)}`;
  };

  const handleTestLogin = () => {
    if (!selectedRole) {
      alert('Please select a role for testing.');
      return;
    }
    window.location.href = `${API_BASE_URL}/login?role=${encodeURIComponent(selectedRole)}`;
  };

  return (
    <div className="login-container">
      <div className="login-card">
        <h1 className="login-title">Hospital Portal</h1>
        <p className="login-subtitle">Access your account securely</p>
        <div className="button-group">
          <button className="login-button normal-login" onClick={handleNormalLogin}>
            Login with Custos
          </button>
          <div className="divider">OR</div>
          <div className="test-login-section">
            <select
              value={selectedRole}
              onChange={(e) => setSelectedRole(e.target.value)}
              className="role-select"
            >
              <option value="">-- Select Role --</option>
              <option value="admin">Admin</option>
              <option value="doctor">Doctor</option>
              <option value="patient">Patient</option>
            </select>
            <button className="login-button test-login" onClick={handleTestLogin}>
              Login for Testing
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Login; */

import React, { useState } from 'react';
import './Login.css'; // Import the corresponding CSS file
import axios from 'axios';

function Login() {
  const [selectedRole, setSelectedRole] = useState('');
  const API_BASE_URL = process.env.REACT_APP_API_BASE_URL || 'http://localhost:8081'; // Dynamically set backend URL
  const CLIENT_ID = process.env.REACT_APP_CLIENT_ID || 'custos-avj2n8708zvqgfw9pexh-10000000'; // Dynamically set client ID

  const handleNormalLogin = async () => {
    try {
      // Redirect the user to the login endpoint
      window.location.href = `${API_BASE_URL}/login?client_id=${encodeURIComponent(CLIENT_ID)}`;
    } catch (err) {
      console.error('Error during login:', err);
      alert('An error occurred during login. Please try again.');
    }
  };

  const handleTestLogin = async () => {
    if (!selectedRole) {
      alert('Please select a role for testing.');
      return;
    }

    try {
      // Simulate login with the selected role
      const response = await axios.post(`${API_BASE_URL}/test-login`, {
        role: selectedRole,
      });
      const { userId, profileComplete } = response.data;

      // Check if profile completion is required
      if (!profileComplete) {
        window.location.href = `/complete-profile?userId=${encodeURIComponent(userId)}`;
      } else {
        window.location.href = '/dashboard';
      }
    } catch (err) {
      console.error('Error during test login:', err);
      alert('An error occurred during test login. Please try again.');
    }
  };
/*
  return (
    <div className="login-container">
      <div className="login-card">
        <h1 className="login-title">Hospital Portal</h1>
        <p className="login-subtitle">Access your account securely</p>
        <div className="button-group">
          <button className="login-button normal-login" onClick={handleNormalLogin}>
            Login with Custos
          </button>
          <div className="divider">OR</div>
          <div className="test-login-section">
            <select
              value={selectedRole}
              onChange={(e) => setSelectedRole(e.target.value)}
              className="role-select"
            >
              <option value="">-- Select Role --</option>
              <option value="admin">Admin</option>
              <option value="doctor">Doctor</option>
              <option value="patient">Patient</option>
            </select>
            <button className="login-button test-login" onClick={handleTestLogin}>
              Login for Testing
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}*/
  

  return (
    <div className="login-container">
      <div className="login-card">
        <h1 className="login-title">Hospital Portal</h1>
        <p className="login-subtitle">Access your account securely</p>
        <div className="button-group">
          <button className="login-button normal-login" onClick={handleNormalLogin}>
            Login with Custos
          </button>         
        
        </div>
      </div>
    </div>
  );
}
export default Login;


