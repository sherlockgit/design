package com.sherlock.design.structural.enjoyment.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Connect {

    private String clientId;

    public void connect(){
        log.info("客户端：{}；建立连接",clientId);
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Connect() {
        log.info("创建连接");
    }
}
