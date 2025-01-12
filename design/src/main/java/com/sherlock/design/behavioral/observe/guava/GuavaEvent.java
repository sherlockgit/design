package com.sherlock.design.behavioral.observe.guava;

import com.google.common.eventbus.Subscribe;
import com.sherlock.design.behavioral.observe.base.MQTTConf;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GuavaEvent {

    @Subscribe
    public void subscribe(MQTTConf mqttConf){
        log.info("接受通知：{}",mqttConf);
    }

    @Subscribe
    public void subscribe1(MQTTConf mqttConf){
        log.info("接受通知：{}",mqttConf);
    }

}
