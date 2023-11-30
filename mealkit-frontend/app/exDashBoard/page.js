"use client"
import React from 'react';
import WeeklyOrderNumber from '../../components/exDashBoardComponents/WeeklyOrderNumber';
import WeeklyOrderRequest from '../../components/exDashBoardComponents/WeeklyOrderRequest';
import WeeklyOutcome from '../../components/exDashBoardComponents/WeeklyOutcome';
import WeeklyReviewStatus from '../../components/exDashBoardComponents/WeeklyReviewStatus';


function page(props) {
  return (
    <div className='bg-amber-300'>
      <div className="container grid grid-cols-2 gap-4">
        <div className='p-4 box-border h-32 p-4 border-4'>
          <WeeklyOrderNumber/>
        </div>
        <div className='p-4 box-border h-32 p-4 border-4'>
          <WeeklyOutcome/>
        </div>
        <div className='p-4 box-border h-32 p-4 border-4'>
          <WeeklyOrderRequest/>
        </div>
        <div className='p-4 box-border h-32 p-4 border-4'>
          <WeeklyReviewStatus/>
        </div>
      </div>
    </div>
  );
}

export default page;