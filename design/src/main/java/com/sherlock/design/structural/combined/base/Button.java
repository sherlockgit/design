package com.sherlock.design.structural.combined.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Button extends System {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        log.info("按钮名称：{}",name);
    }

    public Button(String name) {
        this.name = name;
    }
}
