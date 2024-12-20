package com.sherlock.design.structural.enjoyment.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Connect {

    private String clientId;

    private void connect(){
        log.info("客户端：{}；建立连接",clientId);
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
