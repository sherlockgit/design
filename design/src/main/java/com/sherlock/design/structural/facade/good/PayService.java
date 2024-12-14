package com.sherlock.design.structural.facade.good;

public class PayService {

    private BalanceService balanceService = new BalanceService();
    private OrderService orderService = new OrderService();
    private StockService stockService = new StockService();


    public void pay(Goods goods) throws Exception {
        balanceService.checkBalance(goods);
        orderService.createOrder(goods);
        stockService.reduce(goods);
    }

}
