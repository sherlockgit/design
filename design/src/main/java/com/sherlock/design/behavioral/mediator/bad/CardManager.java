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
public class CardManager {

    private final Map<String,Card> CARD_MAP = new HashMap<>();

    private DeviceManager deviceManager;

    public void setDeviceManager(DeviceManager deviceManager) {
        this.deviceManager = deviceManager;
    }

    public void saveCards(List<Card> cardList){
        log.info("保存设备卡：{}",cardList);
        cardList.stream().forEach(o->{
            CARD_MAP.put(o.getIccid(),o);
        });
    }

    public Device getDeviceInfoByCard(String iccid){
        Device device = deviceManager.getDeviceInfo(CARD_MAP.get(iccid).getImei());
        log.info("卡片：{}；对应的设备信息：{}",iccid,device);
        return device;
    }

}
