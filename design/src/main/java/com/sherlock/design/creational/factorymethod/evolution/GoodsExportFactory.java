package com.sherlock.design.creational.factorymethod.evolution;

public class GoodsExportFactory extends ExportFactory{
    public Export create() {
        return new GoodsExport();
    }
}
