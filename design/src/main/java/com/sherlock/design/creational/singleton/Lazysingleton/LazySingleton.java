package com.sherlock.design.creational.singleton.Lazysingleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }

}
