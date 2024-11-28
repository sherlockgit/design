package com.sherlock.design.principle.singleresponsibility.clazz.bad;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SendManager {

    public void send(String goodsName,String address,boolean isReal){
        if (isReal) {
            log.info("实物商品：{}；发往：{}",goodsName,address);
        }else {
            log.info("虚拟商品：{}；无需目的地",goodsName);
        }
    }

}
