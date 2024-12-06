package com.sherlock.design.creational.abstractfactory.base;

public class Test {

    public static void main(String[] args) {
        Export export = new GoodsExport();
        export.export();
        Import anImport = new GoodsImport();
        anImport.toImport();
    }

}
