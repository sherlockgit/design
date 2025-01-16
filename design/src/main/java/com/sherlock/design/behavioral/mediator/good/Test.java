package com.sherlock.design.behavioral.mediator.good;


import java.util.List;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/16 17:23
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        CardManager cardManager = new CardManager();
        DeviceManager deviceManager = new DeviceManager();
        mediator.setCardManager(cardManager);
        mediator.setDeviceManager(deviceManager);
        cardManager.setMediator(mediator);
        deviceManager.setMediator(mediator);

        Device device = new Device("device1");
        Card card1 = new Card("iccid1","device1");
        Card card2 = new Card("iccid2","device1");
        deviceManager.saveDevice(device, List.of(card1,card2));
        cardManager.getDeviceInfoByCard("iccid1");
    }

}
