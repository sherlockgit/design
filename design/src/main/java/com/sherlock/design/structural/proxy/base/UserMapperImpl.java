package com.sherlock.design.structural.proxy.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMapperImpl implements UserMapper{

    @Override
    public void saveUser(User user) {
        log.info("保存用户：{}",user);
    }
}
