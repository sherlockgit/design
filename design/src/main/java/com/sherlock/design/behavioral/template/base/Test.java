package com.sherlock.design.behavioral.template.base;

import org.apache.ibatis.executor.BaseExecutor;

import javax.servlet.http.HttpServlet;
import java.util.AbstractList;
import java.util.AbstractSet;

public class Test {

    public static void main(String[] args) {
        Export userExport = new UserExport();
        userExport.exportData();

        Export orderExport = new OrderExport();
        orderExport.exportData();
    }

}
