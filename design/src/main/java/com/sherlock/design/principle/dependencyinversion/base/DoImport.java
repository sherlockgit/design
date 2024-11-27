package com.sherlock.design.principle.dependencyinversion.base;

public class DoImport {

    public void run(){
        Import doImport = new Import();
        doImport.importOrder();
        doImport.importGoods();
    }

}
