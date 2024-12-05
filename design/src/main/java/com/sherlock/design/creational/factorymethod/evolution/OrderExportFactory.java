package com.sherlock.design.creational.factorymethod.evolution;

public class OrderExportFactory extends ExportFactory{
    public Export create() {
        return new OrderExport();
    }
}
