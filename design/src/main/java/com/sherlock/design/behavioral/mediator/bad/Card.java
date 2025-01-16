package com.sherlock.design.behavioral.mediator.bad;


import lombok.Data;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 17:39
 */
@Data
public class Card {

    private String iccid;

    private String imei;

    public Card(String iccid, String imei) {
        this.iccid = iccid;
        this.imei = imei;
    }
}
