package com.sherlock.design.structural.facade.good;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {

    private static PayService payService = new PayService();

    public static void main(String[] args) throws Exception {
        Goods goods = new Goods();
        goods.setNum(5);
        goods.setPrice(new BigDecimal(30));
        goods.setName("攀枝花");
        payService.pay(goods);
    }

}
