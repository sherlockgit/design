package com.sherlock.design.behavioral.strategic.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserExport implements Export {
    @Override
    public void toExport() {
        log.info("用户导出");
    }
}
