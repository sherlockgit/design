package com.sherlock.design.creational.bulider.evolution;


import java.math.BigDecimal;

public class OrderActualBuilder extends OrderBuilder {

    private Order order = new Order();

    public void buildId(Integer id) {
        order.setId(id);
    }

    public void buildName(String name) {
        order.setName(name);
    }

    public void buildNum(Integer num) {
        order.setNum(num);
    }

    public void buildPrice(BigDecimal price) {
        order.setPrice(price);
    }

    public Order build() {
        return order;
    }
}
