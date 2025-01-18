package com.sherlock.design.behavioral.state.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 16:38
 */
@Slf4j
public class FailTaskState extends TaskState{
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
        log.error("error not support to change success");
    }

    @Override
    public void fail() {
        log.info("执行失败");
    }
}
