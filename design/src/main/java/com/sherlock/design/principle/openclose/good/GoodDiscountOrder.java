package com.sherlock.design.principle.openclose.good;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
@Slf4j
public class GoodDiscountOrder extends GoodOrder{
    private BigDecimal discount;
    private BigDecimal price;
    public GoodDiscountOrder(BigDecimal price,BigDecimal discount) {
        this.price = price;
        this.discount = discount;
    }

    @Override
    public void buy() {
        log.info("订购商品订单:{}元;原价:{}元;抵扣:{}元",price.subtract(discount),price,discount);
    }
}
