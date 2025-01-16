package com.sherlock.design.behavioral.observe.guava;

import com.google.common.eventbus.EventBus;
import com.sherlock.design.behavioral.observe.base.MQTTConf;

import java.util.EventListener;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post(new MQTTConf("127.0.0.1","1883"));
    }

}
