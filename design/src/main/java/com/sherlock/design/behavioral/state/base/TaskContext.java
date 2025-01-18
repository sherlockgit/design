package com.sherlock.design.behavioral.state.base;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/18 10:41
 */
public class TaskContext {

    private TaskState taskState;
    public final static WaitTaskState WAIT_TASK_STATE = new WaitTaskState();
    public final static RunTaskState RUN_TASK_STATE = new RunTaskState();
    public final static SuccessTaskState SUCCESS_TASK_STATE = new SuccessTaskState();
    public final static FailTaskState FAIL_TASK_STATE = new FailTaskState();

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
        this.taskState.setTaskContext(this);
    }

    public void waiting(){
        this.taskState.waiting();
    }
    public void running(){
        this.taskState.running();
    }
    public void success(){
        this.taskState.success();
    }
    public void fail(){
        this.taskState.fail();
    }
}
