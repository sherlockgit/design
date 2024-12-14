package com.sherlock.design.structural.facade.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderService {

    public void createOrder(Goods goods){
        log.info("生成订单：{}",goods.getName());
    }

}
