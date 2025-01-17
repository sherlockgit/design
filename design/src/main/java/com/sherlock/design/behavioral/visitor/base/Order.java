package com.sherlock.design.behavioral.visitor.base;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:24
 */
public abstract class Order {

    private String orderNum;

    private BigDecimal price;

    private BigDecimal cost;

    public String getOrderNum() {
        return orderNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }


    public abstract void printMessage(IVisitor visitor);
}
