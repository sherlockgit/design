package com.sherlock.design.structural.proxy.dynamicproxy;

import com.sherlock.design.structural.proxy.base.DataSourceContextHolder;
import com.sherlock.design.structural.proxy.base.ID;
import com.sherlock.design.structural.proxy.base.Order;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class ServiceDynamicProxy<T,R extends ID> implements InvocationHandler {

    private T target;

    public ServiceDynamicProxy(T target) {
        this.target = target;
    }

    public T bind(){
        Class cls = target.getClass();
        return (T)Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        R argObject = (R) args[0];
        pre(argObject);
        Object object = method.invoke(target,args);
        after();
        return object;
    }

    private void pre(R object){
        Integer db = object.getId() % 2;
        DataSourceContextHolder.setThreadLocal("DB"+db);
    }

    private void after(){
        log.info("保存数据库成功：{},对象：{}",DataSourceContextHolder.getThreadLocal(),this);
    }
}
