package com.sherlock.design.structural.bridge.bad;

public class Test {

    public static void main(String[] args) {
        Card basePackageDefaultCard = new BasePackageDefaultCard();
        Card basePackageSharePoolCard = new BasePackageSharePoolCard();
        Card overlayPackageDefaultCard = new OverlayPackageDefaultCard();
        Card overlayPackageSharePoolCard = new OverlayPackageSharePoolCard();
        basePackageDefaultCard.pay();
        basePackageSharePoolCard.pay();
        overlayPackageDefaultCard.pay();
        overlayPackageSharePoolCard.pay();
    }

}
