package com.sherlock.design.creational.factorymethod.evolution;

public class Test {

    public static void main(String[] args) {
        ExportFactory exportFactory = new OrderExportFactory();
        Export export = exportFactory.create();
        export.export();
    }

}
