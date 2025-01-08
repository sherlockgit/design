package com.sherlock.design.behavioral.template.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Export {

    //final为防止之类篡改
    protected final void exportData(){
        checkBase();
        checkData();
        queryData();
        toExport();
        if (toSaveLog()) {
            saveLog();
        }
    }

    final void checkBase(){
        log.info("校验基本数据");
    }

    abstract void checkData();

    abstract void queryData();


    final void toExport(){
        log.info("导出数据");
    }

    final void saveLog(){
        log.info("保存日志");
    }

    /**
     * 构造方法
     * @return
     */
    boolean toSaveLog(){
        return false;
    }

}
