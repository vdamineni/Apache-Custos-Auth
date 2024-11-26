/* import React, { useState } from 'react';
import GroupForm from './GroupForm';

const GroupManagement = () => {
  const [groups, setGroups] = useState([]);

  const handleAddGroup = (newGroup) => {
    setGroups([...groups, newGroup]);
  };

  return (
    <div>
      <h2>Group Management</h2>
      <GroupForm onSubmit={handleAddGroup} />
      <ul>
        {groups.map((group, index) => (
          <li key={index}>
            {group.name} - {group.description}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default GroupManagement;*/

import React, { useState } from 'react';

function GroupManagement() {
  const [groupData, setGroupData] = useState({ name: '', description: '' });
  const [feedbackMessage, setFeedbackMessage] = useState('');
  const [isError, setIsError] = useState(false);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setGroupData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = async () => {
    try {
      const response = await fetch('http://localhost:8081/grpc/createGroup', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(groupData),
      });

      if (response.ok) {
        const data = await response.json();
        console.log('Group created successfully:', data);
        setFeedbackMessage('Group created successfully!');
        setIsError(false);
      } else {
        console.error('Failed to create group:', response.statusText);
        setFeedbackMessage('Failed to create group.');
        setIsError(true);
      }
    } catch (error) {
      console.error('Error creating group:', error);
      setFeedbackMessage('Error creating group.');
      setIsError(true);
    }
  };

  return (
    <div className="group-management-container">
      <h2>Group Management</h2>
      <div className="group-form">
        <label>
          Group Name:
          <input
            type="text"
            name="name"
            value={groupData.name}
            onChange={handleInputChange}
          />
        </label>
        <label>
          Description:
          <input
            type="text"
            name="description"
            value={groupData.description}
            onChange={handleInputChange}
          />
        </label>
        <button onClick={handleSubmit}>Create Group</button>
      </div>
      {feedbackMessage && (
        <div className={`feedback-message ${isError ? 'error' : 'success'}`}>
          {feedbackMessage}
        </div>
      )}
    </div>
  );
}

export default GroupManagement;
