package com.sherlock.design.principle.Interfacesegregation.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        CommunicationAction communicationAction = new telephone();
        communicationAction.voiceAction();
    }

}