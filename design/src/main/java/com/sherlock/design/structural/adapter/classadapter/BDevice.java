package com.sherlock.design.structural.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BDevice implements AdapteeReport{
    @Override
    public void post() {
        log.info("B厂家的设备上报");
    }
}
