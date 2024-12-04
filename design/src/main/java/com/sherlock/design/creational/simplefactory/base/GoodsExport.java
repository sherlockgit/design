package com.sherlock.design.creational.simplefactory.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodsExport extends Export{
    public void export() {
        log.info("导出商品数据》》");
    }
}
