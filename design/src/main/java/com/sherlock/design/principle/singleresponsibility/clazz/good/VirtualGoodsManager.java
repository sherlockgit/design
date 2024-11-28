
package com.sherlock.design.principle.singleresponsibility.clazz.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VirtualGoodsManager {

    public void send(String goodsName){
        log.info("虚拟商品：{}；无需目的地",goodsName);
    }

}
