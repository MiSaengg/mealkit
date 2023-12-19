import '@/styles/globals.css'

import type { Metadata } from 'next';
import { Inter } from 'next/font/google';

import Header from '@/components/sellerWeb/header'
import HeaderMobile from '@/components/sellerWeb/header-mobile';
import MarginWidthWrapper from '@/components/sellerWeb/margin-width-wrapper';
import PageWrapper from '@/components/sellerWeb/page-wrapper';
import SideNav from '@/components/sellerWeb/side-nav';

const inter = Inter({ subsets: ['latin'] });

export const metadata: Metadata = {
  title: '한끼',
  description: 'Generated by create next app',
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body className={`bg-white${inter.className}`}>
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
