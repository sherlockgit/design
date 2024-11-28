package com.sherlock.design.principle.singleresponsibility.method.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpManager {

    public void signUp(String name){
        initUser(name);
        initAccount();
        saveIp();
        log.info("用户注册成功");
    }


    private void initUser(String name){
        log.info("注册用户》》:{}",name);
    }

    private void initAccount(){
        log.info("初始化账户");
    }

    private void saveIp(){
        log.info("记录用户IP");
    }

}
