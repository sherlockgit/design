package com.sherlock.design.structural.bridge.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OverlayPackageDefaultCard extends DefaultCard{

    @Override
    void pay() {
        log.info("订购非共享池卡的叠加包套餐");
    }
}