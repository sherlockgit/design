package com.sherlock.design.creational.singleton.threadlocalsingleton;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static ThreadLocal<ThreadLocalSingleton> instance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
