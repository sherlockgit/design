package com.sherlock.design.creational.abstractfactory.evolution;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodsImport extends Import {
    public void toImport() {
        log.info("导入商品数据》》");
    }
}
