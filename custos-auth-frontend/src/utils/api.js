const API_BASE_URL = process.env.REACT_APP_API_BASE_URL;

const handleResponse = async (response) => {
  if (!response.ok) {
    const error = await response.json();
    throw new Error(error.message || 'API request failed');
  }
  return response.json();
};

export const login = async () => {
  const response = await fetch(`${API_BASE_URL}/login`, {
    method: 'GET',
    credentials: 'include', // Allows cookies for the session
  });
  return handleResponse(response);
};

export const logout = async () => {
  const response = await fetch(`${API_BASE_URL}/logout`, {
    method: 'GET',
    credentials: 'include',
  });
  return handleResponse(response);
};

export const fetchUserData = async () => {
  const response = await fetch(`${API_BASE_URL}/user`, {
    method: 'GET',
    credentials: 'include',
  });
  return handleResponse(response);
};
