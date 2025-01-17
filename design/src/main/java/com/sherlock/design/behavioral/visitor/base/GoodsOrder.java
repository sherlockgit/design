package com.sherlock.design.behavioral.visitor.base;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:28
 */
public class GoodsOrder extends Order{

    private String goodsName;

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public GoodsOrder(String goodsName, String orderNum, BigDecimal price, BigDecimal cost) {
        this.goodsName = goodsName;
        this.setOrderNum(orderNum);
        this.setPrice(price);
        this.setCost(cost);
    }

    @Override
    public void printMessage(IVisitor visitor) {
        visitor.visit(this);
    }
}
