package com.sherlock.design.principle.Interfacesegregation.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class telephone implements CommunicationAction {
    public void voiceAction() {
        log.info("发起语音对话》》》");
    }

    public void charactersAction() {

    }

    public void videoAction() {

    }
}
