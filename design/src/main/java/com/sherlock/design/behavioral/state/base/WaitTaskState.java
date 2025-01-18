package com.sherlock.design.behavioral.state.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 16:38
 */
@Slf4j
public class WaitTaskState extends TaskState{
    @Override
    public void waiting() {
        log.info("待执行");
    }

    @Override
    public void running() {
        super.taskContext.setTaskState(TaskContext.RUN_TASK_STATE);
    }

    @Override
    public void success() {
        log.error("error not support to change success");
    }

    @Override
    public void fail() {
        log.error("error not support to change fail");
    }
}
