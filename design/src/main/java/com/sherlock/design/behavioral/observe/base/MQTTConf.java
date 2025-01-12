package com.sherlock.design.behavioral.observe.base;

import lombok.Data;

@Data
public class MQTTConf {

    private String host;

    private String post;

    public MQTTConf(String host, String post) {
        this.host = host;
        this.post = post;
    }
}
