package com.sherlock.design.structural.bridge.good;



public class Test {

    public static void main(String[] args) {
       Card basePackageDefaultCard = new DefaultCard(new BasePackage());
       Card basePackageSharePoolCard = new SharePoolCard(new BasePackage());
       Card overlayPackageDefaultCard = new DefaultCard(new OverlayPackage());
       Card overlayPackageSharePoolCard = new SharePoolCard(new OverlayPackage());
        basePackageDefaultCard.pay();
        basePackageSharePoolCard.pay();
        overlayPackageDefaultCard.pay();
        overlayPackageSharePoolCard.pay();
    }

}
