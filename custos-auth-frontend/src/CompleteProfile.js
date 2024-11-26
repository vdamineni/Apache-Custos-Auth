/* import React, { useState, useEffect } from 'react';
import axios from 'axios';

function CompleteProfile({ userId, onComplete }) {
  const [profile, setProfile] = useState({
    user_id: userId,
    first_name: '',
    last_name: '',
    email: '',
    role: '',
    phone_number: '',
  });

  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  useEffect(() => {
    // Fetch current user profile (if available)
    const fetchProfile = async () => {
      try {
        setLoading(true);
        const response = await axios.get(`http://localhost:8081/users/${userId}`);
        setProfile(response.data);
      } catch (err) {
        console.error('Error fetching profile:', err);
        setError('Unable to fetch profile details.');
      } finally {
        setLoading(false);
      }
    };

    fetchProfile();
  }, [userId]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setProfile((prevProfile) => ({ ...prevProfile, [name]: value }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    setError('');

    try {
      const response = await axios.put(`http://localhost:8081/users/${userId}`, profile);
      console.log('Profile updated successfully:', response.data);

      // Notify parent component that the profile is complete
      if (onComplete) {
        onComplete();
      }
    } catch (err) {
      console.error('Error updating profile:', err);
      setError('Error updating profile. Please try again.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="complete-profile-container">
      <h2>Complete Your Profile</h2>
      {loading && <p>Loading...</p>}
      {error && <p className="error">{error}</p>}

      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="first_name">First Name:</label>
          <input
            type="text"
            id="first_name"
            name="first_name"
            value={profile.first_name}
            onChange={handleChange}
            required
          />
        </div>

        <div className="form-group">
          <label htmlFor="last_name">Last Name:</label>
          <input
            type="text"
            id="last_name"
            name="last_name"
            value={profile.last_name}
            onChange={handleChange}
            required
          />
        </div>

        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={profile.email}
            onChange={handleChange}
            required
          />
        </div>

        <div className="form-group">
          <label htmlFor="role">Role:</label>
          <select id="role" name="role" value={profile.role} onChange={handleChange} required>
            <option value="">-- Select Role --</option>
            <option value="admin">Admin</option>
            <option value="doctor">Doctor</option>
            <option value="patient">Patient</option>
          </select>
        </div>

        <div className="form-group">
          <label htmlFor="phone_number">Phone Number:</label>
          <input
            type="text"
            id="phone_number"
            name="phone_number"
            value={profile.phone_number}
            onChange={handleChange}
          />
        </div>

        <button type="submit" disabled={loading}>
          {loading ? 'Updating...' : 'Update Profile'}
        </button>
      </form>
    </div>
  );
}

export default CompleteProfile; */

import React, { useState, useEffect } from 'react';
import axios from 'axios';

function CompleteProfile({ userId, userInfo, onComplete }) {
  const [profile, setProfile] = useState({
    user_id: userId,
    first_name: userInfo?.first_name || '',
    last_name: userInfo?.last_name || '',
    email: userInfo?.email || '',
    role: userInfo?.role || '',
    phone_number: userInfo?.phone_number || '',
  });

  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const handleChange = (e) => {
    const { name, value } = e.target;
    setProfile((prevProfile) => ({ ...prevProfile, [name]: value }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    setError('');

    try {
      // Make PUT request to update the profile
      const response = await axios.put(`http://localhost:8081/users/${userId}`, profile);
      console.log('Profile updated successfully:', response.data);

      // Notify parent component about the updated user profile
      if (onComplete) {
        onComplete(response.data); // Pass updated user data to parent
      }
    } catch (err) {
      console.error('Error updating profile:', err);
      setError('Error updating profile. Please try again.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="complete-profile-container">
      <h2>Complete Your Profile</h2>
      {loading && <p>Loading...</p>}
      {error && <p className="error">{error}</p>}

      <form onSubmit={handleSubmit}>
        {/* First Name Field */}
        <div className="form-group">
          <label htmlFor="first_name">First Name:</label>
          <input
            type="text"
            id="first_name"
            name="first_name"
            value={profile.first_name}
            onChange={handleChange}
            required
          />
        </div>

        {/* Last Name Field */}
        <div className="form-group">
          <label htmlFor="last_name">Last Name:</label>
          <input
            type="text"
            id="last_name"
            name="last_name"
            value={profile.last_name}
            onChange={handleChange}
            required
          />
        </div>

        {/* Email Field */}
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={profile.email}
            onChange={handleChange}
            required
          />
        </div>

        {/* Role Field */}
        <div className="form-group">
          <label htmlFor="role">Role:</label>
          <select id="role" name="role" value={profile.role} onChange={handleChange} required>
            <option value="">-- Select Role --</option>
            <option value="admin">Admin</option>
            <option value="doctor">Doctor</option>
            <option value="patient">Patient</option>
          </select>
        </div>

        {/* Phone Number Field */}
        <div className="form-group">
          <label htmlFor="phone_number">Phone Number:</label>
          <input
            type="text"
            id="phone_number"
            name="phone_number"
            value={profile.phone_number}
            onChange={handleChange}
          />
        </div>

        {/* Submit Button */}
        <button type="submit" disabled={loading}>
          {loading ? 'Updating...' : 'Update Profile'}
        </button>
      </form>
    </div>
  );
}

export default CompleteProfile;

