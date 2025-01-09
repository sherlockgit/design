package com.sherlock.design.behavioral.Iterator.base;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Menu menu0 = new Menu("用户管理");
        Menu menu1 = new Menu("角色管理");
        Menu menu2 = new Menu("订单管理");
        Menu menu3 = new Menu("财务管理");
        Menu menu4 = new Menu("卡片管理");
        Menu menu5 = new Menu("设备管理");

        MenuManagerService menuManagerService = new MenuManagerServiceImpl();
        menuManagerService.addMenu(menu0);
        menuManagerService.addMenu(menu1);
        menuManagerService.addMenu(menu2);
        menuManagerService.addMenu(menu3);
        menuManagerService.addMenu(menu4);
        menuManagerService.addMenu(menu5);

        MenuIterator menuIterator = menuManagerService.getIterator();
        while (!menuIterator.isLastMenu()){
            menuIterator.getNest();
        }

        menuManagerService.removeMenu(menu2);
        menuManagerService.removeMenu(menu3);

        MenuIterator menuIterator1 = menuManagerService.getIterator();
        while (!menuIterator1.isLastMenu()){
            menuIterator1.getNest();
        }
    }

}
