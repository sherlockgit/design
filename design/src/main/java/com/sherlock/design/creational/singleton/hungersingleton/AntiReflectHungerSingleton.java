package com.sherlock.design.creational.singleton.hungersingleton;

public class AntiReflectHungerSingleton {
    private static AntiReflectHungerSingleton hungerSingleton;
    static {
        hungerSingleton = new AntiReflectHungerSingleton();
    }

    private AntiReflectHungerSingleton(){
        if (hungerSingleton != null) {
            throw new RuntimeException("无法创建单例对象");
        }
    }
    public static AntiReflectHungerSingleton getInstance(){
        return hungerSingleton;
    }
}
