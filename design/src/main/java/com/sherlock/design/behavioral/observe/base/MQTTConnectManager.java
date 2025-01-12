package com.sherlock.design.behavioral.observe.base;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class MQTTConnectManager implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        MQTTConfManager mqttConfManager = (MQTTConfManager) o;
        MQTTConf mqttConf = (MQTTConf) arg;
        log.info("收到新增配置：{}；建立连接---",mqttConf);
    }
}
