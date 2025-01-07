package com.sherlock.design.structural.proxy.staticproxy;

import com.sherlock.design.structural.proxy.base.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceStaticProxy {

    private UserService userService;

    public void saveUser(User user){
        userService = new UserServiceImpl();
        pre(user);
        userService.saveUser(user);
        after();
    }

    private void pre(User user){
        Integer db = user.getUserId() % 2;
        DataSourceContextHolder.setThreadLocal("DB"+db);
    }

    private void after(){
        log.info("保存数据库成功：{}",DataSourceContextHolder.getThreadLocal());
    }

}
