package com.sherlock.design.structural.proxy.staticproxy;


import com.sherlock.design.structural.proxy.base.Order;
import com.sherlock.design.structural.proxy.base.User;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId(1);
        order.setOrderNo("0002");
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

        User user = new User();
        user.setUserId(2);
        user.setUserName("小宇宙");
        UserServiceStaticProxy userServiceStaticProxy = new UserServiceStaticProxy();
        userServiceStaticProxy.saveUser(user);
    }

}
