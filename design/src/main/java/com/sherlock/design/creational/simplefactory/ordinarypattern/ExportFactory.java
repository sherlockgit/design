package com.sherlock.design.creational.simplefactory.ordinarypattern;

public class ExportFactory {

    public Export create(String type){
        if ("order".equals(type)) {
            return new OrderExport();
        }else if("goods".equals(type)){
            return new GoodsExport();
        }
        return null;
    }

}
