package com.sherlock.design.behavioral.observe.base;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

@Slf4j
public class MQTTConfManager extends Observable {

    public void addMQTTConf(MQTTConf mqttConf){
        log.info("添加Mqtt配置：{}",mqttConf);
        setChanged();
        notifyObservers(mqttConf);
    }

}
