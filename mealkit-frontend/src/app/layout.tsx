"use client";

import '../styles/globals.css';
import { SessionProvider } from "next-auth/react";


export default function RootLayout({ children }) {
  return (
    <SessionProvider>
      <html lang="en">
        <body>{children}</body>
      </html>
    </SessionProvider>
  );
}
