package com.sherlock.design.creational.bulider.evolution;


import java.math.BigDecimal;

public abstract class OrderBuilder {

    public abstract void buildId(Integer id);
    public abstract void buildName(String name);
    public abstract void buildNum(Integer num);
    public abstract void buildPrice(BigDecimal price);

    public abstract Order build();

}
