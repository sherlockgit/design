package com.sherlock.design.behavioral.state.base;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 10:41
 */
public abstract class TaskState {

    protected TaskContext taskContext;

    public void setTaskContext(TaskContext taskContext) {
        this.taskContext = taskContext;
    }

    public abstract void waiting();
    public abstract void running();
    public abstract void success();
    public abstract void fail();

}
