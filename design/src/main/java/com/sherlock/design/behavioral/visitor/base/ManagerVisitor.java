package com.sherlock.design.behavioral.visitor.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:31
 */
@Slf4j
public class ManagerVisitor implements IVisitor{
    @Override
    public void visit(GoodsOrder goodsOrder) {
        log.info("管理员访问商品订单信息：订单号：{}；价格：{}，商品名称：{}；成本：{}",goodsOrder.getOrderNum(),goodsOrder.getPrice(),goodsOrder.getGoodsName(),goodsOrder.getCost());
    }

    @Override
    public void visit(MemberOrder memberOrder) {
        log.info("管理员访问会员订单信息：订单号：{}；价格：{}；成本：{}",memberOrder.getOrderNum(),memberOrder.getPrice(),memberOrder.getCost());
    }
}
