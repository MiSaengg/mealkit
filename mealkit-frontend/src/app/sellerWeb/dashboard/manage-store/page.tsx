import React from 'react';

const ManageStorePage = () => {
  return (
    <>
      <span className="font-bold text-4xl">가게 관리</span>

      <div className="grid grid-cols-2 divide-x divide-y">
        <div className="rounded-md p-4 box-border border-4">E-mail</div>
        <div className="rounded-md p-4 box-border border-4">Address</div>
        <div className="rounded-md p-4 box-border border-4">Phone Number</div>
        <div className="rounded-md p-4 box-border border-4">City</div>
        <div className="rounded-md p-4 box-border border-4">Password</div>
        <div className="rounded-md p-4 box-border border-4">State</div>
      </div>
    </>
  );
};

export default ManageStorePage;
