package com.sherlock.design.principle.Interfacesegregation.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Call implements VoiceAction {
    public void voiceAction() {
        log.info("发起语音对话》》》");
    }
}
