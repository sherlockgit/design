package com.sherlock.design.structural.combined.base;

public abstract class System {

    public void add(System system){
        throw new UnsupportedOperationException("不支持添加");
    }
    public void remove(System system){
        throw new UnsupportedOperationException("不支持删除");
    }
    public String getName(){
        throw new UnsupportedOperationException("不支持获取名称");
    }
    public Integer getLevel(){
        throw new UnsupportedOperationException("不支持获取级别");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印");
    }

}
