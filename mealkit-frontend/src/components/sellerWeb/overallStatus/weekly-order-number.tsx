import React, {PureComponent} from 'react';
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
  ReferenceLine,
  ResponsiveContainer,
} from 'recharts';

const data = [
  {
    "name": "MON",
    "This Week": 1500,
    "Last Week": 2000
  },
  {
    "name": "TUE",
    "This Week": 2000,
    "Last Week": 1200
  },
  {
    "name": "WED",
    "This Week": 3000,
    "Last Week": 2400
  },
  {
    "name": "THUR",
    "This Week": 4200,
    "Last Week": 2400
  },
  {
    "name": "FRI",
    "This Week": 1800,
    "Last Week": 2400
  },
  {
    "name": "SAT",
    "This Week": 2700,
    "Last Week": 2400
  },
  {
    "name": "SUN",
    "This Week": 900,
    "Last Week": 2400
  }
]

const WeeklyOrderNumber = () => {
  return (
    <>
   <div>
    <div className="flex justify-center"><h1>WeeklyOrderNumber </h1></div>
    <div>
      <LineChart width={500} height={250} data={data}
      margin={{ top: 5, right: 30, left: 20, bottom: 5 }}>
      <CartesianGrid strokeDasharray="3 3" />
      <XAxis dataKey="name" />
      <YAxis />
      <Tooltip />
      <Legend />
      <Line type="monotone" dataKey="This Week" stroke="#A66867" />
      <Line type="monotone" dataKey="Last Week" stroke="#000000" />
      </LineChart>
    </div>
    
  </div>
    </>
  );
};

export default WeeklyOrderNumber;