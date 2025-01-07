package com.sherlock.design.structural.proxy.dynamicproxy;

import com.sherlock.design.structural.proxy.base.*;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1);
        order.setOrderNo("0002");
        ServiceDynamicProxy<OrderService, Order> orderServiceDynamicProxy = new ServiceDynamicProxy(new OrderServiceImpl());
        OrderService orderService = orderServiceDynamicProxy.bind();
        orderService.saveOrder(order);

        User user = new User();
        user.setId(2);
        user.setUserName("小宇宙");
        ServiceDynamicProxy<UserService, User> userServiceDynamicProxy = new ServiceDynamicProxy(new UserServiceImpl());
        UserService userService = userServiceDynamicProxy.bind();
        userService.saveUser(user);
    }

}
