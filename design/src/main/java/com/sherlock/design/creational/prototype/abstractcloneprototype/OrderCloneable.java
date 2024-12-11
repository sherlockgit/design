package com.sherlock.design.creational.prototype.abstractcloneprototype;

public abstract class OrderCloneable implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
