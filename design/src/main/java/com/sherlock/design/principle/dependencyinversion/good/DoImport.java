package com.sherlock.design.principle.dependencyinversion.good;


public class DoImport {

    public void run(){
        Import goodsImport = new GoodsImport();
        goodsImport.toImport();
        Import orderImport = new OrderImport();
        orderImport.toImport();
        Import userImport = new UserImport();
        userImport.toImport();
    }

}
