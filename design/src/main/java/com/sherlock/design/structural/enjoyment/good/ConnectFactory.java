package com.sherlock.design.structural.enjoyment.good;

import java.util.HashMap;
import java.util.Map;

public class ConnectFactory {

    private static final Map<String,Connect> POOL = new HashMap<>();

    public static Connect getConnect(String clientId){
        Connect connect = POOL.get(clientId);
        if (connect == null) {
            connect = new Connect();
            connect.setClientId(clientId);
            POOL.put(clientId,connect);
        }
        return connect;
    }

}
