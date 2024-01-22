"use client";
import "@/styles/globals.css";

import { useSession, signIn } from "next-auth/react";
import { useEffect } from "react";

import Header from "@/components/sellerWeb/header";
import HeaderMobile from "@/components/sellerWeb/header-mobile";
import MarginWidthWrapper from "@/components/sellerWeb/margin-width-wrapper";
import PageWrapper from "@/components/sellerWeb/page-wrapper";
import SideNav from "@/components/sellerWeb/side-nav";

export default function RootLayout({ children }) {
  const { data: session, status } = useSession();

  useEffect(() => {
    if (status === "loading") return;
    if (!session) signIn();
  }, [session, status]);

  if (status === "loading") {
    return <div>Loading...</div>;
  }

  return (
    <html lang="en">
      <body className={`bg-white`}>
        <div className="flex">
          <SideNav />
          <main className="flex-1">
            <MarginWidthWrapper>
              <Header />
              <HeaderMobile />
              <PageWrapper>{children}</PageWrapper>
            </MarginWidthWrapper>
          </main>
        </div>
      </body>
    </html>
  );
}
