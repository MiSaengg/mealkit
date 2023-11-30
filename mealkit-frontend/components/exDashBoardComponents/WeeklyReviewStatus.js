import React from 'react';

function WeeklyReviewStatus(props) {
  return (
    <div className='bg-amber-300'>
    <h1> Review</h1>
    <div className="container grid grid-cols-2 gap-10">
      <div className='p-4 h-20 w-20 box-border p-4 border-4'>
        <h1>Total</h1>
      </div>
      <div className='p-4 h-20 w-20 box-border p-4 border-4'>   
        <h1>Unanswered</h1>   
      </div>
    </div>
  </div>
  );
}

export default WeeklyReviewStatus;