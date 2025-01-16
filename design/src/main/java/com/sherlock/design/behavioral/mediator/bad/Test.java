package com.sherlock.design.behavioral.mediator.bad;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 17:42
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        Device device = new Device("device1");
        Card card1 = new Card("iccid1","device1");
        Card card2 = new Card("iccid2","device1");
        DeviceManager deviceManager = new DeviceManager();
        CardManager cardManager = new CardManager();
        deviceManager.setCardManager(cardManager);
        cardManager.setDeviceManager(deviceManager);
        deviceManager.saveDevice(device, List.of(card1,card2));
        cardManager.getDeviceInfoByCard("iccid1");
    }

}
