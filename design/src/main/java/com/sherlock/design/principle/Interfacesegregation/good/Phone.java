package com.sherlock.design.principle.Interfacesegregation.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Phone implements CharactersAction,VideoAction,VoiceAction {

    public void charactersAction() {
        log.info("开启文本通话");
    }

    public void videoAction() {
        log.info("开启视频通话");
    }

    public void voiceAction() {
        log.info("开启语音通话");
    }
}
