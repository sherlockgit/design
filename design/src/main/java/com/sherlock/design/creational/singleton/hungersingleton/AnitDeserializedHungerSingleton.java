package com.sherlock.design.creational.singleton.hungersingleton;

import java.io.Serializable;

public class AnitDeserializedHungerSingleton implements Serializable {
    private static AnitDeserializedHungerSingleton hungerSingleton;
    static {
        hungerSingleton = new AnitDeserializedHungerSingleton();
    }

    private AnitDeserializedHungerSingleton(){}
    public static AnitDeserializedHungerSingleton getInstance(){
        return hungerSingleton;
    }

    private Object readResolve(){
        return hungerSingleton;
    }
}
