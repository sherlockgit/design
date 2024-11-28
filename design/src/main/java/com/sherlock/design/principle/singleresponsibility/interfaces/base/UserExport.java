package com.sherlock.design.principle.singleresponsibility.interfaces.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserExport implements FileManager{
    public void export() {
        log.info("导出用户数据》》》");
    }
}
