package com.sherlock.design.creational.singleton.hungersingleton;

import java.io.Serializable;

public class CloneHungerSingleton implements Serializable,Cloneable {
    private static CloneHungerSingleton hungerSingleton;
    static {
        hungerSingleton = new CloneHungerSingleton();
    }

    private CloneHungerSingleton(){}
    public static CloneHungerSingleton getInstance(){
        return hungerSingleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
