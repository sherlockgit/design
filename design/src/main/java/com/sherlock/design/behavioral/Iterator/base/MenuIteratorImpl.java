package com.sherlock.design.behavioral.Iterator.base;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class MenuIteratorImpl implements MenuIterator{

    private List<Menu> menus;
    private int position;
    private Menu menu;
    public MenuIteratorImpl(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public Menu getNest() {
        menu = menus.get(position);
        log.info("当前菜单对象：{}，位置：{}",menu,position);
        position ++;
        return menu;
    }

    @Override
    public boolean isLastMenu() {
        return !(position < menus.size());
    }
}
