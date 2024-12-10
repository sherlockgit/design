package com.sherlock.design.creational.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
