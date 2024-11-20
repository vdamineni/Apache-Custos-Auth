import React, { useState } from 'react';
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

export default GroupManagement;
