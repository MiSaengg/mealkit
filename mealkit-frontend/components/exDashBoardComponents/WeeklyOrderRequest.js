import React from 'react';

function WeeklyOrderRequest(props) {
  return (
    <div className='bg-amber-300'>
    <h1>OrderStatus</h1>
    <div className="container grid grid-cols-4 gap-10">
      <div className='p-4 h-20 w-20 box-border p-4 border-4' >
        <h1>Waiting</h1>
      </div>
      <div className='p-4 h-20 w-20 box-border p-4 border-4'>      
       <h1>In Progress</h1>
      </div>
      <div className='p-4 h-20 w-20 box-border p-4 border-4'>      
        <h1>Canceled</h1>
      </div>
      <div className='p-4 h-20 w-20 box-border p-4 border-4'>      
        <h1>Approved</h1>
      </div>
    </div>
  </div>
  );
}

export default WeeklyOrderRequest;