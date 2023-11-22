import React, { useState } from 'react';

interface DashboardProps {
  onButtonClick: (buttonName: string) => void;
}

const Dashboard: React.FC<DashboardProps> = ({ onButtonClick }) => {
  const [isOpen, setIsOpen] = useState(false);

  const handleToggle = () => {
    setIsOpen(!isOpen);
  };

  return (
    <div className="common-button">
      <h2 onClick={handleToggle}>
        Dashboard
        <span className={`triangle ${isOpen ? 'up' : 'down'}`} />
      </h2>
      {isOpen && (
        <div className="buttons">
          <button onClick={() => onButtonClick('overview')}>전체 현황</button>
          <button onClick={() => onButtonClick('store-management')}>가게 관리</button>
          <button onClick={() => onButtonClick('temporary-closure')}>영업 임시 중단</button>
        </div>
      )}
    </div>
  );
}

export default Dashboard;
