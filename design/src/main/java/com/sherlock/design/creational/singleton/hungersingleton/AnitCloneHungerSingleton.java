

package com.sherlock.design.creational.singleton.hungersingleton;

import java.io.Serializable;

public class AnitCloneHungerSingleton implements Serializable,Cloneable {
    private static AnitCloneHungerSingleton hungerSingleton;
    static {
        hungerSingleton = new AnitCloneHungerSingleton();
    }

    private AnitCloneHungerSingleton(){}
    public static AnitCloneHungerSingleton getInstance(){
        return hungerSingleton;
    }

    @Override
    public Object clone() {
        return getInstance();
    }
}
