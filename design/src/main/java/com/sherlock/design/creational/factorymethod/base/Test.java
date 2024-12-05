package com.sherlock.design.creational.factorymethod.base;

import org.slf4j.LoggerFactory;

import java.net.URLStreamHandlerFactory;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Export export = new GoodsExport();
        export.export();
    }

}
