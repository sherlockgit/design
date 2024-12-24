package com.sherlock.design.structural.bridge.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SharePoolCard extends Card {
    public SharePoolCard(Package aPackage) {
        super(aPackage);
    }

    @Override
    void pay() {
        log.info("订购共享池卡");
        aPackage.pay();
    }
}
