package com.sherlock.design.structural.proxy.base;

public class OrderServiceImpl implements OrderService{

    private OrderMapper orderMapper;

    @Override
    public void saveOrder(Order order) {
        orderMapper = new OrderMapperImpl();
        orderMapper.saveOrder(order);
    }
}
