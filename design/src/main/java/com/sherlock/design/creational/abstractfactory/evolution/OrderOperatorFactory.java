package com.sherlock.design.creational.abstractfactory.evolution;

import com.sherlock.design.creational.abstractfactory.base.GoodsImport;
import com.sherlock.design.creational.abstractfactory.base.Import;
import com.sherlock.design.creational.abstractfactory.base.OrderImport;

public class OrderOperatorFactory implements OperatorFactory{
    public Export createExport() {
        return new OrderExport();
    }

    public Import createImport() {
        return new OrderImport();
    }
}
