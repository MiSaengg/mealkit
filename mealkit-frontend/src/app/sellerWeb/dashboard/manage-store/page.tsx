"use client"

import StoreManageInput from '@/components/sellerWeb/storeManage/store-manage-input';
import StoreManageEditSave from '@/components/sellerWeb/storeManage/store-manage-edit_save';

import React, { useState } from 'react';

const ManageStorePage = () => {
  const [email, setEmail] = useState('');
  const [address, setAddress] = useState('');
  const [phoneNumber, setPhoneNumber] = useState('');
  const [city, setCity] = useState('');
  const [password, setPassword] = useState('');
  const [state, setState] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    // Here you'll handle the submission of all fields
  };

  return (
    <>
      <span className="font-bold text-4xl">Manage Store</span>

      <form onSubmit={handleSubmit} className="grid grid-cols-2 gap-10 divide-x divide-y">
        <div className="font-bold">
          Email
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="email" value={email} onChange={setEmail}/>
        </div>
        </div>
        
        <div className="font-bold">
          Address
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="text" value={address} onChange={setAddress} placeholder="Enter your address"/>
        </div>
        </div>
        
        <div className="font-bold">
          Phone Number
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="tel" value={phoneNumber} onChange={setPhoneNumber} placeholder="Enter your phone number"/>
        </div>
        </div>

        <div className="font-bold">
          City
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="text" value={city} onChange={setCity} placeholder="Enter your city"/>
        </div>
        </div>
        
        <div className="font-bold">
          Password
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="password" value={password} onChange={setPassword} placeholder="Enter your password"/>
        </div>
        </div>
        
        <div className="font-bold">
          State
        <div className="col-span-2 rounded-md p-4 box-border border-4">
          <StoreManageEditSave type="text" value={state} onChange={setState} placeholder="Enter your state"/>
        </div>
        </div>
      </form>
    </>
  );
};

export default ManageStorePage;