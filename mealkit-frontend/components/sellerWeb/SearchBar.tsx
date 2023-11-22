import React, { useState } from 'react';

interface SearchBarProps {
  onSearch: (query: string) => void;
}

const SearchBar: React.FC<SearchBarProps> = ({ onSearch }) => {
  const [query, setQuery] = useState('');

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setQuery(e.target.value);
  };

  const handleSearch = () => {
    onSearch(query);
  };

  return (
    <div style={{ display: 'flex', alignItems: 'center' }}>
      <input 
        type="text" 
        placeholder="Search" 
        value={query}
        onChange={handleInputChange}
        style={{ padding: '5px', borderRadius: '5px', marginRight: '5px' }}
      />
      <button onClick={handleSearch} style={{ padding: '5px 10px', borderRadius: '5px', cursor: 'pointer' }}>Search</button>
    </div>
  );
}

export default SearchBar;
