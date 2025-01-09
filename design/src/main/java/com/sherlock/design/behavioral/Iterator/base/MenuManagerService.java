package com.sherlock.design.behavioral.Iterator.base;

public interface MenuManagerService {

    void addMenu(Menu menu);

    void removeMenu(Menu menu);

    MenuIterator getIterator();

}
