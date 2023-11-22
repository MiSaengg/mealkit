'use client'

import React from 'react';
import SearchBar from './sellerWeb/SearchBar'; 
import StoreIcon from './sellerWeb/StoreIcon'; 

const SellerHeader: React.FC = () => {
  const handleSearch = (query: string) => {
    console.log('Searching for:', query);
  };


  return (
    <div className="header">
      <div className="logo">Logo</div>
      <div className="right-section">
        <SearchBar onSearch={handleSearch} />
        <button className="button">Settings</button>
        <button className="button">Notifications</button>
        <StoreIcon />
      </div>
    </div>
  );
}

export default SellerHeader;
