package com.sherlock.design.creational.singleton.containersingleton;


import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static ConcurrentHashMap<String,Object> instances = new ConcurrentHashMap<String, Object>();

    public static void putInstance(String key,Object o){
        if (null != key && null != o) {
            synchronized (ContainerSingleton.class){
                if (!instances.contains(key)) {
                    instances.put(key,o);
                }
            }
        }
    }

    public static Object getInstance(String key){
        return instances.get(key);
    }

}
