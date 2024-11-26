package com.sherlock.design.principle.openclose.bad;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class GoodOrder implements IOrder {

    private BigDecimal price;

    private BigDecimal discount;

    public GoodOrder(BigDecimal price,BigDecimal discount) {
        this.price = price;
        this.discount = discount;
    }

    public GoodOrder() {
    }

    public void refund() {
        log.info("退订商品订单！！！");
    }

    public void buy() {
        log.info("订购商品订单:{}元;原价:{}元;抵扣:{}元",price.subtract(discount),price,discount);
    }
}
