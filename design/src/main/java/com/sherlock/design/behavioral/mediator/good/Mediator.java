package com.sherlock.design.behavioral.mediator.good;

import java.util.List;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/16 17:12
 */
public class Mediator {

    private CardManager cardManager;

    private DeviceManager deviceManager;

    public void setCardManager(CardManager cardManager) {
        this.cardManager = cardManager;
    }

    public void setDeviceManager(DeviceManager deviceManager) {
        this.deviceManager = deviceManager;
    }

    public void saveCards(List<Card> cardList){
        cardManager.saveCards(cardList);
    }

    public Device getDeviceInfo(String imei){
       return deviceManager.getDeviceInfo(imei);
    }
}
