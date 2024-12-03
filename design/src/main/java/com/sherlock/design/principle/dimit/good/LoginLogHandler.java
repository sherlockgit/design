package com.sherlock.design.principle.dimit.good;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class LoginLogHandler {

    public void save(String username){
        LoginLog loginLog = new LoginLog();
        loginLog.setLoginDate(new Date());
        loginLog.setUsername(username);
        log.info("保存登录日志：{}",loginLog);
    }


}
