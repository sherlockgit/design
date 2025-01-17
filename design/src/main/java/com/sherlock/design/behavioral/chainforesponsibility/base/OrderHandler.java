package com.sherlock.design.behavioral.chainforesponsibility.base;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 16:31
 */
public abstract class OrderHandler {

    private OrderHandler orderHandler;

    public OrderHandler setNextOrderHandler(OrderHandler orderHandler){
        this.orderHandler = orderHandler;
        return orderHandler;
    }

    public boolean hasNextOrderHandler(){
        return !(orderHandler == null);
    }

    public OrderHandler getNextOrderHandler(){
        return orderHandler;
    }

    protected abstract void check(Order order);

}
