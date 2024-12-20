package com.sherlock.design.structural.enjoyment.good;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> clients = List.of("client1","client2","client3","client4");
        for (int i = 0;i < 10;i++){
            ConnectFactory.getConnect(clients.get((int) (Math.random() * clients.size()))).connect();
        }
    }

}
