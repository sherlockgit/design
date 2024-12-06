package com.sherlock.design.creational.abstractfactory.evolution;

import com.sherlock.design.creational.abstractfactory.base.Import;

public interface OperatorFactory {

    Export createExport();

    Import createImport();

}
