package com.sherlock.design.principle.Interfacesegregation.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        VoiceAction communicationAction = new Call();
        communicationAction.voiceAction();
    }

}
