package com.sherlock.design.behavioral.visitor.base;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:28
 */
public class MemberOrder extends Order{

    public MemberOrder(String orderNum, BigDecimal price, BigDecimal cost) {
        this.setOrderNum(orderNum);
        this.setPrice(price);
        this.setCost(cost);
    }

    @Override
    public void printMessage(IVisitor visitor) {
        visitor.visit(this);
    }
}
