package com.sherlock.design.behavioral.state.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 16:38
 */
@Slf4j
public class RunTaskState extends TaskState{
    @Override
    public void waiting() {
        log.error("error not support to change waiting");
    }

    @Override
    public void running() {
        log.info("运行中");
    }

    @Override
    public void success() {
        super.taskContext.setTaskState(TaskContext.SUCCESS_TASK_STATE);
    }

    @Override
    public void fail() {
        super.taskContext.setTaskState(TaskContext.FAIL_TASK_STATE);
    }
}
