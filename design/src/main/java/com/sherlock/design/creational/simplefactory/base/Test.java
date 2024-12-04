package com.sherlock.design.creational.simplefactory.base;

import java.sql.DriverManager;
import java.util.Calendar;

public class Test {

    public static void main(String[] args) {
        Export export = new GoodsExport();
        export.export();
    }

}
