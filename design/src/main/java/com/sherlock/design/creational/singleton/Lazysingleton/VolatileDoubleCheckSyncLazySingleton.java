package com.sherlock.design.creational.singleton.Lazysingleton;

public class VolatileDoubleCheckSyncLazySingleton {

    private volatile static VolatileDoubleCheckSyncLazySingleton doubleCheckSyncLazySingleton = null;

    private VolatileDoubleCheckSyncLazySingleton(){}

    public static VolatileDoubleCheckSyncLazySingleton getInstance(){
        if (doubleCheckSyncLazySingleton == null) {
            synchronized (VolatileDoubleCheckSyncLazySingleton.class){
                if (doubleCheckSyncLazySingleton == null) {
                    return new VolatileDoubleCheckSyncLazySingleton();
                }
            }
        }
        return doubleCheckSyncLazySingleton;
    }

}
