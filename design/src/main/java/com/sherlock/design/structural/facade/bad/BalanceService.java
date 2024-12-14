package com.sherlock.design.structural.facade.bad;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BalanceService {

    public void checkBalance(Goods goods) throws Exception {
        if (goods.getPrice() == null || goods.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new Exception("金额异常");
        }
        log.info("金额校验通过：{}",goods.getPrice());
    }

}
