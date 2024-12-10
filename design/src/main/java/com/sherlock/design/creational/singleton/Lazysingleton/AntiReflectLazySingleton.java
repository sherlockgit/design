package com.sherlock.design.creational.singleton.Lazysingleton;

public class AntiReflectLazySingleton {

    private static AntiReflectLazySingleton lazySingleton = null;
    private static boolean flag = true;
    private AntiReflectLazySingleton(){
        if (flag) {
            flag = false;
            lazySingleton = this;
        }else {
            throw new RuntimeException("无法创建单例对象");
        }
    }

    public static AntiReflectLazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new AntiReflectLazySingleton();
        }
        return lazySingleton;
    }

}
