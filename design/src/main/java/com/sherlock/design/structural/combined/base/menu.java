package com.sherlock.design.structural.combined.base;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class menu extends System{

    private List<System> item = new ArrayList<>();

    private String name;

    private Integer level;

    @Override
    public void add(System system) {
        item.add(system);
    }

    @Override
    public void remove(System system) {
        item.remove(system);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public void print() {
        log.info("目录名称：{}",name);
        for(System system : item){
            system.print();
        }
    }

    public menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
}
