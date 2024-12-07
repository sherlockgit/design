package com.sherlock.design.creational.bulider.link;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .id(100000)
                .name("商品名称")
                .num(10)
                .price(new BigDecimal(10)).build();
        log.info("商品订单：{}，",order);
    }
}
