package com.sherlock.design.behavioral.template.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserExport extends Export{


    @Override
    void checkData() {
        log.info("校验用户数据");
    }

    @Override
    void queryData() {
        log.info("查询用户数据");
    }

    @Override
    boolean toSaveLog() {
        return true;
    }
}
