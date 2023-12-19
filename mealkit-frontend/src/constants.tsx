import { Icon } from '@iconify/react';

import { SideNavItem } from './types';

export const SIDENAV_ITEMS: SideNavItem[] = [
  {
    title: 'DashBoard',
    path: '/sellerWeb/dashboard',
    icon: <Icon icon="material-symbols:arrow-right" width="24" height="24" />,
    submenu : true,
    subMenuItems: [
      {title : '전체 현황' , path: '/sellerWeb/dashboard/overall-status'},
      {title : '가게 관리' , path: '/sellerWeb/dashboard/manage-store'},
      {title : '영업 임시중단' , path: '/sellerWeb/dashboard/temporary-close'},
    ]
  },
  {
    title: 'Menu',
    path: '/sellerWeb/menu',
    icon: <Icon icon="material-symbols:arrow-right" width="24" height="24" />,
    submenu: true,
    subMenuItems: [
      { title: '메뉴 관리', path: '/sellerWeb/menu/menu-manage' },      
    ],
  },
  {
    title: 'Order',
    path: '/sellerWeb/order',
    icon: <Icon icon="material-symbols:arrow-right" width="24" height="24" />,
  },
  {
    title: 'Review',
    path: '/sellerWeb/review',
    icon: <Icon icon="material-symbols:arrow-right" width="24" height="24" />,    
  },
  {
    title: 'Add',
    path: '/sellerWeb/add',
    icon: <Icon icon="material-symbols:arrow-right" width="24" height="24" />,
  },
];
