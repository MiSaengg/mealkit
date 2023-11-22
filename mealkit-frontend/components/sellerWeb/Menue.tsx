import React from 'react';

interface MenuProps {
  onMenuClick: () => void;
}

const Menu: React.FC<MenuProps> = ({ onMenuClick }) => {
  return (
    <button className="common-button" onClick={onMenuClick}>
      Menue
    </button>
  );
}

export default Menu;
