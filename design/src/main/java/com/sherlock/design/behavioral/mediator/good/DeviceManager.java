package com.sherlock.design.behavioral.mediator.good;

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


    private final Map<String, Device> DEVICE_MAP = new HashMap<>();

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void saveDevice(Device device, List<Card> cards){
        log.info("保存设备:{}",device);
        DEVICE_MAP.put(device.getImei(),device);
        mediator.saveCards(cards);
    }

    public Device getDeviceInfo(String imei){
        return DEVICE_MAP.get(imei);
    }
}
