package com.sherlock.design.behavioral.observe.base;

public class Test {
    public static void main(String[] args) {
        MQTTConf mqttConf = new MQTTConf("127.0.0.1","1883");
        MQTTConfManager mqttConfManager = new MQTTConfManager();
        mqttConfManager.addObserver(new MQTTConnectManager());
        mqttConfManager.addMQTTConf(mqttConf);
    }
}
