package com.sherlock.design.principle.openclose.bad;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {
    public static void main(String[] args) {
        IOrder iOrder = new GoodOrder(new BigDecimal(20),new BigDecimal(5));
        iOrder.buy();
    }
}
