package com.sherlock.design.structural.bridge.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OverlayPackageSharePoolCard extends SharePoolCard{

    @Override
    void pay() {
        log.info("订购共享池卡的叠加套餐");
    }
}
