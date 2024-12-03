package com.sherlock.design.principle.dimit.good;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class LoginHandler {

    public void login(String username){
        log.info("用户：{}-登录",username);
        LoginLogHandler loginLogHandler = new LoginLogHandler();
        loginLogHandler.save(username);
    }


}
