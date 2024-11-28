package com.sherlock.design.principle.singleresponsibility.method.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpManager {

    public void signUp(String name){
        log.info("注册用户》》:{}",name);
        log.info("用户注册成功");
    }

}
