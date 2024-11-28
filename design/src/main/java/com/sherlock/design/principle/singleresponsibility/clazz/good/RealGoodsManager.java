package com.sherlock.design.principle.singleresponsibility.clazz.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealGoodsManager {

    public void send(String goodsName,String address){
        log.info("商品：{}；发往：{}",goodsName,address);
    }

}
