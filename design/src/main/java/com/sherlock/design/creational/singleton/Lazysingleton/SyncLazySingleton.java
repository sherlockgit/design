package com.sherlock.design.creational.singleton.Lazysingleton;

public class SyncLazySingleton {

    private static SyncLazySingleton syncLazySsingleton = null;

    private SyncLazySingleton(){}

    public synchronized static SyncLazySingleton getInstance(){
        if (syncLazySsingleton == null) {
            return new SyncLazySingleton();
        }
        return syncLazySsingleton;
    }

}
