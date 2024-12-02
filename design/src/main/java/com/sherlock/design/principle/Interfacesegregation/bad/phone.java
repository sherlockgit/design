package com.sherlock.design.principle.Interfacesegregation.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class phone implements CommunicationAction{
    public void voiceAction() {
        log.info("开启语音通话");
    }

    public void charactersAction() {
        log.info("开启文本通话");
    }

    public void videoAction() {
        log.info("开启视频通话");
    }
}
