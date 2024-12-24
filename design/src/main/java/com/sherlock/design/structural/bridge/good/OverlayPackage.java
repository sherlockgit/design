package com.sherlock.design.structural.bridge.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OverlayPackage implements Package{
    @Override
    public void pay() {
        log.info("订购叠加包");
    }
}
