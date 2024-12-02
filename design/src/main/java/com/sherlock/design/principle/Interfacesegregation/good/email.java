package com.sherlock.design.principle.Interfacesegregation.good;

import com.sherlock.design.principle.Interfacesegregation.bad.CommunicationAction;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class email implements CharactersAction {
    public void charactersAction() {
        log.info("发送文字邮箱》》》");
    }

}
