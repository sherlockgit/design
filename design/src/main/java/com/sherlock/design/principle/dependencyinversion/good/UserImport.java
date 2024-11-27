package com.sherlock.design.principle.dependencyinversion.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserImport implements Import {
    public void toImport() {
        log.info("导入用户数据");
    }
}
