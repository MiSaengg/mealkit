import React from 'react';
type Props = {
    type: string;
    value: string;
    onChange: (value: string) => void;
    placeholder?: string;
};

const StoreManageInput = ({ type, value, onChange, placeholder }: Props) => {
  return (
    <input 
      type={type} 
      required 
      value={value} 
      onChange={(e) => onChange(e.target.value)} 
      placeholder={placeholder || `Enter your ${type}`} 
    />
  );
};

export default StoreManageInput;