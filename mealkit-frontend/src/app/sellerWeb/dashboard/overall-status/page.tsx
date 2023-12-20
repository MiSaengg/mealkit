"use client"
import React from 'react';

import WeeklySales from '@/components/sellerWeb/overallStatus/weekly-sales';
import WeeklyOrderNumber from '@/components/sellerWeb/overallStatus/weekly-order-number';
import WeeklyOrderRequest from '@/components/sellerWeb/overallStatus/weekly-order-request';
import WeeklyReviewStatus from '@/components/sellerWeb/overallStatus/weekly-review-status';

const OverAllStatusPage = () => {
  return (
    <>
      <span className="font-bold text-4xl">전체 현황</span>
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
      
    </>
  );
};

export default OverAllStatusPage;
