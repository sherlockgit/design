package com.sherlock.design.principle.openclose.bad;

/**
 * 订单接口
 */
public interface IOrder {

    /**
     *订购
     */
    void refund();

    /**
     * 退款
     */
    void buy();

}