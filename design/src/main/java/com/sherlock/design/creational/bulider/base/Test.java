package com.sherlock.design.creational.bulider.base;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
@Slf4j
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1000000);
        order.setNum(2);
        order.setPrice(new BigDecimal(10));
        order.setName("商品名称");
        log.info("商品订单：{}，",order);
    }

}
