package com.sherlock.design.creational.simplefactory.staticpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderExport extends Export {
    public void export() {
        log.info("导出订单数据》》");
    }
}
