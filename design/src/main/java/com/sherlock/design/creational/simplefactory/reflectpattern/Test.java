package com.sherlock.design.creational.simplefactory.reflectpattern;

public class Test {

    public static void main(String[] args) {
        ExportFactory exportFactory = new ExportFactory();
        Export export = exportFactory.create(OrderExport.class);
        if (export == null) {
            return;
        }
        export.export();
    }

}
