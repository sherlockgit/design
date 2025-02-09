package com.sherlock.design.creational.singleton.Lazysingleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
