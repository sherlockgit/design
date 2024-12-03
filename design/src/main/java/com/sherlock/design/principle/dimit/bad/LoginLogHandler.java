package com.sherlock.design.principle.dimit.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginLogHandler {

    public void save(LoginLog loginLog){
        log.info("保存登录日志：{}",loginLog);
    }


}
