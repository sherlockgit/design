package com.sherlock.design.principle.openclose.base;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class GoodOrder implements IOrder {

    private BigDecimal price;

    public GoodOrder(BigDecimal price) {
        this.price = price;
    }

    public void refund() {
        log.info("退订商品订单！！！");
    }

    public void buy() {
        log.info("订购商品订单:{}元",price);
    }
}
