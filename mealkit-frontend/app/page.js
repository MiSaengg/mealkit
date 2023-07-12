"use client"

import { useEffect, useState } from "react"


export default function Home() {

  const [data , setData] = useState(0)

  useEffect(() => {
    const fetchData = async () => {
      
      try{
        const res = await fetch(`${process.env.NEXT_PUBLIC_API_URL}/api/market` , {        
          method : "GET",
          headers : {
            "Content-Type" : "application/json",
          },
        })          
        const dataBody = await res.json();
        console.log(dataBody)        
        setData(dataBody)
      }catch (error){
        console.log(error)
      }
    }
      fetchData()
  }, [])
  
  

  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
      {data.map((dataElement , index) => {
        return <div key={index}>{dataElement.name}</div>
      })}      
    </main>
  )
}
