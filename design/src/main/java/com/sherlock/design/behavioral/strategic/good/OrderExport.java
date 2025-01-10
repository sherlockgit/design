package com.sherlock.design.behavioral.strategic.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderExport implements Export {
    @Override
    public void toExport() {
        log.info("订单导出");
    }
}
