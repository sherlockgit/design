package com.sherlock.design.principle.singleresponsibility.clazz.base;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SendManager {

    public void send(String goodsName,String address){
        log.info("商品：{}；发往：{}",goodsName,address);
    }

}
