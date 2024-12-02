package com.sherlock.design.principle.Interfacesegregation.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Call implements CommunicationAction{
    public void voiceAction() {
        log.info("发起语音对话》》》");
    }
}
