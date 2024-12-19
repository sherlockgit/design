package com.sherlock.design.structural.adapter.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ADevice implements TargetReport{
    @Override
    public void report() {
        log.info("A厂家的设备上报");
    }
}
