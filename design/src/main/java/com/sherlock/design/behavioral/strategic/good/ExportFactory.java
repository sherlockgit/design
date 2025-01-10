package com.sherlock.design.behavioral.strategic.good;

import java.util.HashMap;
import java.util.Map;

public class ExportFactory {

    private static final Map<String,Export> EXPORT_MAP  = new HashMap<>();

    static {
        EXPORT_MAP.put(ExportKey.GOODS,new GoodsExport());
        EXPORT_MAP.put(ExportKey.ORDER,new OrderExport());
        EXPORT_MAP.put(ExportKey.USER,new UserExport());
    }

    public static Export getExport(String key){
        return EXPORT_MAP.get(key);
    }
    private ExportFactory(){

    }

    private interface ExportKey{
        String ORDER = "ORDER";
        String GOODS = "GOODS";
        String USER = "USER";

    }

}
