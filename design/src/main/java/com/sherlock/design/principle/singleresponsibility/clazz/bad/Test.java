package com.sherlock.design.principle.singleresponsibility.clazz.bad;

public class Test {

    public static void main(String[] args) {
        SendManager sendManager = new SendManager();
        sendManager.send("书","深圳",true);
        sendManager.send("电子书","深圳",false);
    }

}

