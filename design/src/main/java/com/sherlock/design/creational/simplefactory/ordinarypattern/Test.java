package com.sherlock.design.creational.simplefactory.ordinarypattern;

public class Test {

    public static void main(String[] args) {
        ExportFactory exportFactory = new ExportFactory();
        Export export = exportFactory.create("order");
        if (export == null) {
            return;
        }
        export.export();
    }

}
