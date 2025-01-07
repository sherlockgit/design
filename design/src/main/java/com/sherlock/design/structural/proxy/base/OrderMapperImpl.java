package com.sherlock.design.structural.proxy.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderMapperImpl implements OrderMapper{
    @Override
    public void saveOrder(Order order) {
        log.info("保存订单：{},对象：{}",order,this);
    }
}
