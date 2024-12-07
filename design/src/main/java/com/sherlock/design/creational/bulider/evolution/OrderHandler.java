package com.sherlock.design.creational.bulider.evolution;


import java.math.BigDecimal;

public class OrderHandler {

    private OrderBuilder orderBuilder;

    public void setOrderBuilder(OrderBuilder orderBuilder){
        this.orderBuilder = orderBuilder;
    }

    public Order makeOrder(Integer id, String name, Integer num, BigDecimal price){
        orderBuilder.buildId(id);
        orderBuilder.buildName(name);
        orderBuilder.buildNum(num);
        orderBuilder.buildPrice(price);
        return orderBuilder.build();
    }

}
