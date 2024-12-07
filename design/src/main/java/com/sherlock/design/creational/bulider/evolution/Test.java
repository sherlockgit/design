package com.sherlock.design.creational.bulider.evolution;

import lombok.extern.slf4j.Slf4j;


import java.math.BigDecimal;
@Slf4j
public class Test {

    public static void main(String[] args) {
        OrderHandler orderHandler = new OrderHandler();
        OrderBuilder orderBuilder = new OrderActualBuilder();
        orderHandler.setOrderBuilder(orderBuilder);
        Order order = orderHandler.makeOrder(100000,"商品名称",10,new BigDecimal(10));
        log.info("商品订单：{}，",order);
    }

}
