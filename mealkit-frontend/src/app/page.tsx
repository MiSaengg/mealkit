"use client";

import { useEffect, useState } from "react";
import Login from "@/components/login/login";
import { useSession } from "next-auth/react";

export default function Home() {
  const [data, setData] = useState([]);
  const { data: session, status } = useSession();

  useEffect(() => {
    if (status === "authenticated") {
      const fetchData = async () => {
        try {
          const res = await fetch(
            `${process.env.NEXT_PUBLIC_API_URL}/api/market`,
            {
              method: "GET",
              headers: {
                "Content-Type": "application/json",
              },
            }
          );
          const dataBody = await res.json();
          console.log(dataBody);
          setData(dataBody);
        } catch (error) {
          console.log(error);
        }
      };
      fetchData();
    }
  }, [status]);

  if (status === "loading") {
    return <div>Loading...</div>;
  }

  return (
    <main className="flex h-screen flex-col items-center justify-between p-24">
      {/* {status === "authenticated" &&
        data.map((dataElement, index) => {
          return <div key={index}>{dataElement.name}</div>;
        })} */}
      <Login />
    </main>
  );
}
