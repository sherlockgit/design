package com.sherlock.design.behavioral.strategic.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodsExport implements Export {
    @Override
    public void toExport() {
        log.info("商品导出");
    }
}
