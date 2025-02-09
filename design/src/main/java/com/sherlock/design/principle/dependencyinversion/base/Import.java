package com.sherlock.design.principle.dependencyinversion.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Import {

    public void importOrder(){
        log.info("导入订单数据");
    }

    public void importGoods(){
        log.info("导入商品数据");
    }

}
