package com.sherlock.design.principle.singleresponsibility.clazz.base;

public class Test {

    public static void main(String[] args) {
        SendManager sendManager = new SendManager();
        sendManager.send("书","深圳");
    }

}

