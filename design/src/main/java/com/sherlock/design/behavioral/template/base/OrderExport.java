package com.sherlock.design.behavioral.template.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderExport extends Export{
    @Override
    void checkData() {
        log.info("校验订单数据");
    }

    @Override
    void queryData() {
        log.info("查询订单数据");
    }
}
