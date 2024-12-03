package com.sherlock.design.principle.dimit.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginHandler {

    public void login(String username){
        log.info("用户：{}-登录",username);
    }


}
