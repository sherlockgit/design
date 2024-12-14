package com.sherlock.design.structural.facade.base;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.RequestFacade;
import org.apache.ibatis.session.Configuration;
import org.springframework.jdbc.support.JdbcUtils;

import java.math.BigDecimal;

@Slf4j
public class Test {

    public static void main(String[] args) throws Exception {
        Goods goods = new Goods();
        goods.setNum(5);
        goods.setPrice(new BigDecimal(30));
        goods.setName("攀枝花");
        if (goods.getPrice() == null || goods.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("金额异常");
        }
        log.info("金额校验通过：{}",goods.getPrice());
        log.info("生成订单：{}",goods.getName());
        log.info("减去库存数量：{}",goods.getNum());
    }

}
