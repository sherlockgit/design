package com.sherlock.design.creational.singleton.Lazysingleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        log.info("lazySingleton:{}",lazySingleton);
    }

}
