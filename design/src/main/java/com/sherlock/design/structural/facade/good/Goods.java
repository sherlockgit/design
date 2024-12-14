package com.sherlock.design.structural.facade.good;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {

    private String name;

    private BigDecimal price;

    private Integer num;
}
