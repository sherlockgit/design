package com.sherlock.design.principle.singleresponsibility.interfaces.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserExport implements FileManager {
    public void export() {
        log.info("导出用户数据》》》");
    }

    public void imports() {
        log.info("导入用户数据》》》");
    }
}
