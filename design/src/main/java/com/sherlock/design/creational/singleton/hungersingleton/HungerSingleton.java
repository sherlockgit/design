package com.sherlock.design.creational.singleton.hungersingleton;

import java.io.Serializable;

public class HungerSingleton implements Serializable {
    private static HungerSingleton hungerSingleton;
    static {
        hungerSingleton = new HungerSingleton();
    }

    private HungerSingleton(){}
    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }
}
