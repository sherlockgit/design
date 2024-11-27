package com.sherlock.design.principle.dependencyinversion.bad;

public class DoImport {

    public void run(){
        Import doImport = new Import();
        doImport.importOrder();
        doImport.importGoods();
        doImport.importUser();
    }

}
