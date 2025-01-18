package com.sherlock.design.behavioral.state.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 16:38
 */
@Slf4j
public class SuccessTaskState extends TaskState{
    @Override
    public void waiting() {
        log.error("error not support to change waiting");
    }

    @Override
    public void running() {
        log.error("error not support to change running");
    }

    @Override
    public void success() {
        log.info("执行成功");
    }

    @Override
    public void fail() {
        log.error("error not support to change fail");
    }
}
