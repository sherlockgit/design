package com.sherlock.design.creational.singleton.Lazysingleton;

public class DoubleCheckSyncLazySingleton {

    private static DoubleCheckSyncLazySingleton doubleCheckSyncLazySingleton = null;

    private DoubleCheckSyncLazySingleton(){}

    public static DoubleCheckSyncLazySingleton getInstance(){
        if (doubleCheckSyncLazySingleton == null) {
            synchronized (DoubleCheckSyncLazySingleton.class){
                if (doubleCheckSyncLazySingleton == null) {
                    return new DoubleCheckSyncLazySingleton();
                }
            }
        }
        return doubleCheckSyncLazySingleton;
    }

}
