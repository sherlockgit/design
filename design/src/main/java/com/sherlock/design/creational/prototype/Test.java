package com.sherlock.design.creational.prototype;

import com.sherlock.design.creational.prototype.abstractcloneprototype.AbstractCloneGoods;
import com.sherlock.design.creational.prototype.abstractcloneprototype.AbstractCloneOrder;
import com.sherlock.design.creational.prototype.base.Goods;
import com.sherlock.design.creational.prototype.base.Order;
import com.sherlock.design.creational.prototype.deepcloneprototype.DeepCloneGoods;
import com.sherlock.design.creational.prototype.deepcloneprototype.DeepCloneOrder;
import com.sherlock.design.creational.prototype.shallowcloneprototype.ShallowCloneGoods;
import com.sherlock.design.creational.prototype.shallowcloneprototype.ShallowCloneOrder;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
public class Test {

    public static void main(String[] args) {

        log.info("========================base===========================");
        List<Order> orders = new ArrayList<Order>();
        for(int i = 0;i < 5;i++){
            Order order = new Order();
            order.setNo("no"+i);
            order.setCreateDate(new Date(i*10000000000L));
            Goods goods = new Goods();
            goods.setGoodsName("商品名称");
            goods.setNum(i);
            order.setGoods(goods);
            orders.add(order);
        }
        orders.stream().forEach(o->{
            log.info("生成订单数据：{}",o);
        });

        try {
            log.info("========================浅克隆的原型模式(在该业务场景中存在缺陷)===========================");
            List<ShallowCloneOrder> shallowCloneOrders = new ArrayList<>();
            ShallowCloneOrder shallowCloneOrder = new ShallowCloneOrder();
            shallowCloneOrder.setCreateDate(new Date());
            ShallowCloneGoods shallowCloneGoods = new ShallowCloneGoods();
            shallowCloneGoods.setGoodsName("商品名称");
            shallowCloneOrder.setGoods(shallowCloneGoods);

            for(int i = 0;i < 5;i++){
                ShallowCloneOrder shallowCloneOrderTemp = (ShallowCloneOrder) shallowCloneOrder.clone();
                shallowCloneOrderTemp.setNo("no"+i);
                shallowCloneOrderTemp.getCreateDate().setTime(i*10000000000L);
                shallowCloneOrderTemp.getGoods().setNum(i);
                shallowCloneOrders.add(shallowCloneOrderTemp);
            }
            shallowCloneOrders.stream().forEach(o->{
                log.info("生成订单数据：{}",o);
            });
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        try {
            log.info("========================深克隆的原型模式===========================");
            List<DeepCloneOrder> deepCloneOrders = new ArrayList<>();
            DeepCloneOrder deepCloneOrder = new DeepCloneOrder();
            deepCloneOrder.setCreateDate(new Date());
            DeepCloneGoods deepCloneGoods = new DeepCloneGoods();
            deepCloneGoods.setGoodsName("商品名称");
            deepCloneOrder.setGoods(deepCloneGoods);

            for(int i = 0;i < 5;i++){
                DeepCloneOrder deepCloneOrderTemp = (DeepCloneOrder) deepCloneOrder.clone();
                deepCloneOrderTemp.setNo("no"+i);
                deepCloneOrderTemp.getCreateDate().setTime(i*10000000000L);
                deepCloneOrderTemp.getGoods().setNum(i);
                deepCloneOrders.add(deepCloneOrderTemp);
            }
            deepCloneOrders.stream().forEach(o->{
                log.info("生成订单数据：{}",o);
            });
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        try {
            log.info("========================抽象方法的原型模式===========================");
            List<AbstractCloneOrder> deepCloneOrders = new ArrayList<>();
            AbstractCloneOrder deepCloneOrder = new AbstractCloneOrder();
            deepCloneOrder.setCreateDate(new Date());
            AbstractCloneGoods deepCloneGoods = new AbstractCloneGoods();
            deepCloneGoods.setGoodsName("商品名称");
            deepCloneOrder.setGoods(deepCloneGoods);

            for(int i = 0;i < 5;i++){
                AbstractCloneOrder deepCloneOrderTemp = (AbstractCloneOrder) deepCloneOrder.clone();
                deepCloneOrderTemp.setNo("no"+i);
                deepCloneOrderTemp.getCreateDate().setTime(i*10000000000L);
                deepCloneOrderTemp.getGoods().setNum(i);
                deepCloneOrders.add(deepCloneOrderTemp);
            }
            deepCloneOrders.stream().forEach(o->{
                log.info("生成订单数据：{}",o);
            });
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
