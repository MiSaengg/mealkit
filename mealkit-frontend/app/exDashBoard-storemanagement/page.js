"use client";
import React from "react";

function page(props) {
  return (
    <div className="bg-amber-300">
      <div class="grid grid-cols-2 divide-x divide-y">
        <div class="rounded-md p-4 box-border border-4">E-mail</div>
        <div class="rounded-md p-4 box-border border-4">Address</div>
        <div class="rounded-md p-4 box-border border-4">Phone Number</div>
        <div class="rounded-md p-4 box-border border-4">City</div>
        <div class="rounded-md p-4 box-border border-4">Password</div>
        <div class="rounded-md p-4 box-border border-4">State</div>
      </div>
    </div>
  );
}

export default page;
