import React, {PureComponent} from 'react';
import { BarChart, Bar, Rectangle, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';
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

const WeeklySales = () => {
  return (
    <>
      
      <div className="flex justify-center"><h1>Weekly Sales</h1></div>
      <div>
        <BarChart width={500} height={250} data={data}>
      <CartesianGrid strokeDasharray="3 3" />
      <XAxis dataKey="name" />
      <YAxis />
      <Tooltip />
      <Legend />
      <Bar dataKey="This Week" fill="#883534" />
      <Bar dataKey="Last Week" fill="#858689" />
      </BarChart>
      </div>
      
    
    </>
  );
};

export default WeeklySales;