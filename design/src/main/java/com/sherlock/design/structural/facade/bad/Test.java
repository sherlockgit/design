package com.sherlock.design.structural.facade.bad;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {

    private static BalanceService balanceService = new BalanceService();
    private static OrderService orderService = new OrderService();
    private static StockService stockService = new StockService();

    public static void main(String[] args) throws Exception {
        Goods goods = new Goods();
        goods.setNum(5);
        goods.setPrice(new BigDecimal(30));
        goods.setName("攀枝花");
        balanceService.checkBalance(goods);
        orderService.createOrder(goods);
        stockService.reduce(goods);
    }

}
