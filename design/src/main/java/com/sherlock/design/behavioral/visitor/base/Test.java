package com.sherlock.design.behavioral.visitor.base;

import org.springframework.beans.factory.config.BeanDefinitionVisitor;

import java.math.BigDecimal;
import java.nio.file.FileVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:35
 */
public class Test {

    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        Order goodsOrder1 = new GoodsOrder("感冒灵","GO001",new BigDecimal(15),new BigDecimal(9));
        Order goodsOrder2 = new GoodsOrder("降噪耳塞","GO002",new BigDecimal(60),new BigDecimal(5));
        Order memberOrder = new MemberOrder("MO002",new BigDecimal(29),new BigDecimal(0));
        list.add(goodsOrder1);
        list.add(goodsOrder2);
        list.add(memberOrder);

        for(Order order : list){
            order.printMessage(new UserVisitor());
            order.printMessage(new ManagerVisitor());
        }
    }

}
