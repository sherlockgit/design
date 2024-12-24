package com.sherlock.design.structural.bridge.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultCard extends Card {
    public DefaultCard(Package aPackage) {
        super(aPackage);
    }

    @Override
    public void pay() {
        log.info("订购非共享池卡");
        aPackage.pay();
    }
}
