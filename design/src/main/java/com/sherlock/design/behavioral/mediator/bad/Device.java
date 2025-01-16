package com.sherlock.design.behavioral.mediator.bad;


import lombok.Data;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 17:38
 */
@Data
public class Device {

    private String imei;

    public Device(String imei) {
        this.imei = imei;
    }
}
