import { ReactNode } from 'react';

export default function MarginWidthWrapper({
  children,
}: {
  children: ReactNode;
}) {
  return (
    <div className="flex flex-col md:ml-10 sm:border-r sm:border-zinc-700 min-h-screen">
      {children}
    </div>
  );
}
