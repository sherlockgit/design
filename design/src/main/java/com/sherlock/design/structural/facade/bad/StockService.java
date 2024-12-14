package com.sherlock.design.structural.facade.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockService {

    public void reduce(Goods goods){
        log.info("减去库存数量：{}",goods.getNum());
    }

}
