import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Login from './Login';
import Logout from './Logout';
import Dashboard from './Dashboard';

function App() {
  return (
    <Router>
      <Routes>
        {/* Route for the dashboard page */}
        <Route path="/dashboard" element={<Dashboard />} />
        
        {/* Route for the login page */}
        <Route path="/" element={<Login />} />
        
        {/* Route for the logout page */}
        <Route path="/logout" element={<Logout />} />
        
        {/* Fallback route for undefined paths */}
        <Route path="*" element={<div>404 - Page Not Found</div>} />
      </Routes>
    </Router>
  );
}

export default App;

