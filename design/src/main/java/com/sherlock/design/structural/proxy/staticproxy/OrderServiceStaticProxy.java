package com.sherlock.design.structural.proxy.staticproxy;

import com.sherlock.design.structural.proxy.base.DataSourceContextHolder;
import com.sherlock.design.structural.proxy.base.Order;
import com.sherlock.design.structural.proxy.base.OrderService;
import com.sherlock.design.structural.proxy.base.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceStaticProxy {

    private OrderService orderService;

    public void saveOrder(Order order){
        orderService = new OrderServiceImpl();
        pre(order);
        orderService.saveOrder(order);
        after();
    }

    private void pre(Order order){
        Integer db = order.getOrderId() % 2;
        DataSourceContextHolder.setThreadLocal("DB"+db);
    }

    private void after(){
        log.info("保存数据库成功：{}",DataSourceContextHolder.getThreadLocal());
    }

}
