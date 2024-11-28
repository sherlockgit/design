package com.sherlock.design.principle.singleresponsibility.method.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpManager {

    public void signUp(String name){
        log.info("注册用户》》:{}",name);
        log.info("初始化账户");
        log.info("记录用户IP");
        log.info("用户注册成功");
    }

}
