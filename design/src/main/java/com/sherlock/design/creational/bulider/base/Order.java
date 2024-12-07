package com.sherlock.design.creational.bulider.base;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Integer id;

    private String name;

    private Integer num;

    private BigDecimal price;

}
