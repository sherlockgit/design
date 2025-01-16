package com.sherlock.design.behavioral.mediator.bad;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:
* @Author: linmuyu
* @Date: 2025/1/16 16:44
*/
@Slf4j
public class DeviceManager {

    private CardManager cardManager;

    private final Map<String,Device> DEVICE_MAP = new HashMap<>();

    public void setCardManager(CardManager cardManager) {
        this.cardManager = cardManager;
    }

    public void saveDevice(Device device, List<Card> cards){
        log.info("保存设备:{}",device);
        DEVICE_MAP.put(device.getImei(),device);
        cardManager.saveCards(cards);
    }

    public Device getDeviceInfo(String imei){
        return DEVICE_MAP.get(imei);
    }
}
