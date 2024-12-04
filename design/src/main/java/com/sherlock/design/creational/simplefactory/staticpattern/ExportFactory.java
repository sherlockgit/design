package com.sherlock.design.creational.simplefactory.staticpattern;

public class ExportFactory {

    public static Export create(String type){
        if ("order".equals(type)) {
            return new OrderExport();
        }else if("goods".equals(type)){
            return new GoodsExport();
        }
        return null;
    }

}
