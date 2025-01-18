package com.sherlock.design.behavioral.state.base;

import lombok.extern.slf4j.Slf4j;

import javax.faces.lifecycle.Lifecycle;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 16:52
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        TaskContext taskContext = new TaskContext();
        taskContext.setTaskState(TaskContext.WAIT_TASK_STATE);
        log.info("当前状态：{}",taskContext.getTaskState().getClass().getSimpleName());
        taskContext.running();
        log.info("当前状态：{}",taskContext.getTaskState().getClass().getSimpleName());
        taskContext.success();
        log.info("当前状态：{}",taskContext.getTaskState().getClass().getSimpleName());
        taskContext.fail();
        log.info("当前状态：{}",taskContext.getTaskState().getClass().getSimpleName());

    }

}
