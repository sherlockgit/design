package com.sherlock.design.principle.singleresponsibility.clazz.good;

public class Test {

    public static void main(String[] args) {
        RealGoodsManager realGoodsManager = new RealGoodsManager();
        realGoodsManager.send("书","深圳");
        VirtualGoodsManager virtualGoodsManager = new VirtualGoodsManager();
        virtualGoodsManager.send("电子书");
    }

}

