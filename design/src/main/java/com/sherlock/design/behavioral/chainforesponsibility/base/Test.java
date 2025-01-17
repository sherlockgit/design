package com.sherlock.design.behavioral.chainforesponsibility.base;

import javax.servlet.Filter;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 16:41
 */
public class Test {

    public static void main(String[] args) {
        OrderHandler amountOrderHandler = new AmountOrderHandler();
        OrderHandler paymentOrderHandler = new PaymentOrderHandler();
        OrderHandler goodsOrderHandler = new GoodsOrderHandler();

        paymentOrderHandler.setNextOrderHandler(amountOrderHandler).setNextOrderHandler(goodsOrderHandler);

        Order order = new Order();
        order.setAmount(new BigDecimal(30));
        order.setPayment("微信支付");
        order.setGoods("梅尼耶");

        paymentOrderHandler.check(order);
    }
}
