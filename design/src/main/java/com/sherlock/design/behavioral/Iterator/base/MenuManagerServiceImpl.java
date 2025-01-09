package com.sherlock.design.behavioral.Iterator.base;

import java.util.ArrayList;
import java.util.List;

public class MenuManagerServiceImpl implements MenuManagerService{

    List<Menu> menus;

    public MenuManagerServiceImpl() {
        this.menus = new ArrayList<>();
    }

    @Override
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    @Override
    public void removeMenu(Menu menu) {
        menus.remove(menu);
    }

    public MenuIterator getIterator(){
        return new MenuIteratorImpl(menus);
    }


}
