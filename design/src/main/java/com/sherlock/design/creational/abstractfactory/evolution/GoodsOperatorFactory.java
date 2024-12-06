package com.sherlock.design.creational.abstractfactory.evolution;

import com.sherlock.design.creational.abstractfactory.base.GoodsImport;
import com.sherlock.design.creational.abstractfactory.base.Import;

public class GoodsOperatorFactory implements OperatorFactory{
    public Export createExport() {
        return new GoodsExport();
    }

    public Import createImport() {
        return new GoodsImport();
    }
}
