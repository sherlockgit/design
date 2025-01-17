package com.sherlock.design.behavioral.chainforesponsibility.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 16:37
 */
@Slf4j
public class AmountOrderHandler extends OrderHandler{
    @Override
    protected void check(Order order) {
        if (order.getAmount() != null) {
            log.info("支付金额校验通过：{}",order);
            if (hasNextOrderHandler()) {
                getNextOrderHandler().check(order);
            }
        }else {
            log.info("支付金额校验不通过：{}",order);
        }
    }
}
