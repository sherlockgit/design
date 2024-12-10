package com.sherlock.design.creational.singleton;

import com.sherlock.design.creational.singleton.Lazysingleton.AntiReflectLazySingleton;
import com.sherlock.design.creational.singleton.Lazysingleton.LazySingleton;
import com.sherlock.design.creational.singleton.enumsingleton.EnumSingleton;
import com.sherlock.design.creational.singleton.hungersingleton.AntiReflectHungerSingleton;
import com.sherlock.design.creational.singleton.hungersingleton.HungerSingleton;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class ReflectAttack {

    public static void main(String[] args){

        try {
            log.info("======================反射攻击===========================");
            log.info("HungerSingleton:{}", HungerSingleton.getInstance());
            Constructor constructor = HungerSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            log.info("reflect attack HungerSingleton:{}",constructor.newInstance());
        } catch (InstantiationException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (IllegalAccessException e) {
            log.error("error:{}",e.getMessage(),e);
        }catch (NoSuchMethodException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (InvocationTargetException e) {
            log.error("error:{}",e.getMessage(),e);
        }

        try {
            log.info("======================防反射攻击（饿汉式）===========================");
            log.info("Object:{}", HungerSingleton.getInstance());
            Constructor antiConstructor = AntiReflectHungerSingleton.class.getDeclaredConstructor();
            antiConstructor.setAccessible(true);
            log.info("reflect attack AntiReflectHungerSingleton:{}",antiConstructor.newInstance());
        } catch (InstantiationException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (IllegalAccessException e) {
            log.error("error:{}",e.getMessage(),e);
        }catch (NoSuchMethodException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (InvocationTargetException e) {
            log.error("error:{}",e.getMessage(),e);
        }

        try {
            log.info("======================反射攻击（懒汉式）===========================");
            log.info("Object:{}", LazySingleton.getInstance());
            Constructor lazyConstructor = LazySingleton.class.getDeclaredConstructor();
            lazyConstructor.setAccessible(true);
            log.info("reflect attack AntiReflectHungerSingleton:{}",lazyConstructor.newInstance());
        } catch (InstantiationException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (IllegalAccessException e) {
            log.error("error:{}",e.getMessage(),e);
        }catch (NoSuchMethodException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (InvocationTargetException e) {
            log.error("error:{}",e.getMessage(),e);
        }

        try {
            log.info("======================防反射攻击（懒汉式）实际无法完全防御,反射可以修改任何除了final以外的任何参数===========================");
            Constructor antiConstructor = AntiReflectLazySingleton.class.getDeclaredConstructor();
            antiConstructor.setAccessible(true);
            log.info("reflect attack AntiReflectHungerSingleton:{}",antiConstructor.newInstance());
            log.info("Object:{}", AntiReflectLazySingleton.getInstance());
        } catch (InstantiationException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (IllegalAccessException e) {
            log.error("error:{}",e.getMessage(),e);
        }catch (NoSuchMethodException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (InvocationTargetException e) {
            log.error("error:{}",e.getMessage(),e);
        }

        try {
            log.info("======================反射攻击（枚举）===========================");
            log.info("EnumSingleton:{}", EnumSingleton.getInstance());
            Constructor constructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            log.info("reflect attack EnumSingleton:{}",constructor.newInstance("EnumSingleton",0));
        } catch (InstantiationException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (IllegalAccessException e) {
            log.error("error:{}",e.getMessage(),e);
        }catch (NoSuchMethodException e) {
            log.error("error:{}",e.getMessage(),e);
        } catch (InvocationTargetException e) {
            log.error("error:{}",e.getMessage(),e);
        }
    }

}
