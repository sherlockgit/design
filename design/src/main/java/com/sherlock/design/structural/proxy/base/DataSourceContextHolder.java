package com.sherlock.design.structural.proxy.base;

public class DataSourceContextHolder {

    public static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void setThreadLocal(String dataSource){
        THREAD_LOCAL.set(dataSource);
    }

    public static String getThreadLocal(){
        return THREAD_LOCAL.get();
    }

}
