package com.sherlock.design.principle.singleresponsibility.interfaces.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserManager implements FileImportManager,FileExportManager {
    public void export() {
        log.info("导出用户数据》》》");
    }

    public void imports() {
        log.info("导入用户数据》》》");
    }
}
