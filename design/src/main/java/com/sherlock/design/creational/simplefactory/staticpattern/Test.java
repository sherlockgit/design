package com.sherlock.design.creational.simplefactory.staticpattern;

public class Test {

    public static void main(String[] args) {
        Export export = ExportFactory.create("order");
        if (export == null) {
            return;
        }
        export.export();
    }

}
