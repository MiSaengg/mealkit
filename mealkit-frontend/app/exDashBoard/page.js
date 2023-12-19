"use client"
import React from 'react';
import WeeklyOrderNumber from '../../components/exDashBoardComponents/WeeklyOrderNumber';
import WeeklyOrderRequest from '../../components/exDashBoardComponents/WeeklyOrderRequest';
import WeeklySales from '../../components/exDashBoardComponents/WeeklySales';
import WeeklyReviewStatus from '../../components/exDashBoardComponents/WeeklyReviewStatus';


function page(props) {
  return (
    <div className='bg-amber-300'>
      <h1> Overall Status</h1>
      <div className="container grid grid-cols-2 gap-10">
        <div className='p-4 box-border border-4'>
          <WeeklySales/>
        </div>
        <div className='p-4 box-border border-4'>
          <WeeklyOrderNumber/>
        </div>
        <div className='p-4 box-border border-4'>
          <WeeklyOrderRequest/>
        </div>
        <div className='p-4 box-border border-4'>
          <WeeklyReviewStatus/>
        </div>
      </div>
    </div>
  );
}

export default page;