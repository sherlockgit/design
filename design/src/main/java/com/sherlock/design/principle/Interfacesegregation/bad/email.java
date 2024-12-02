package com.sherlock.design.principle.Interfacesegregation.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class email implements CommunicationAction{
    public void voiceAction() {

    }

    public void charactersAction() {
        log.info("发送文字邮箱》》》");
    }

    public void videoAction() {

    }
}
