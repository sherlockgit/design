package com.sherlock.design.creational.singleton.Lazysingleton;

public class StaticInnerClassSingleton {


    private StaticInnerClassSingleton(){};

    public static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
