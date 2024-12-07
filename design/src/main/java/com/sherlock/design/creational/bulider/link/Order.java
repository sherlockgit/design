package com.sherlock.design.creational.bulider.link;

import com.sherlock.design.creational.bulider.evolution.OrderHandler;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Integer id;

    private String name;

    private Integer num;

    private BigDecimal price;

    Order(OrderBuilder orderBuilder){
        this.id = orderBuilder.id;
        this.name = orderBuilder.name;
        this.num = orderBuilder.num;
        this.price = orderBuilder.price;
    }

    public static class OrderBuilder{
        private Integer id;

        private String name;

        private Integer num;

        private BigDecimal price;

        public OrderBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public OrderBuilder name(String name){
            this.name = name;
            return this;
        }

        public OrderBuilder num(Integer numnum){
            this.num = num;
            return this;
        }

        public OrderBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }

}
