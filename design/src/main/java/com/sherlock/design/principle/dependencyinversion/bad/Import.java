package com.sherlock.design.principle.dependencyinversion.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Import {

    public void importOrder(){
        log.info("导入订单数据");
    }

    public void importGoods(){
        log.info("导入商品数据");
    }

    public void importUser(){
        log.info("导入用户数据");
    }


}
