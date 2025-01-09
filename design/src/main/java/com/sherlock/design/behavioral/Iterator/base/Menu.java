package com.sherlock.design.behavioral.Iterator.base;

import lombok.Data;

@Data
public class Menu {

    private String name;

    public Menu(String name) {
        this.name = name;
    }
}
