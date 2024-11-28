package com.sherlock.design.principle.singleresponsibility.interfaces.base;

public class Test {

    public static void main(String[] args) {
        FileManager fileManager = new UserExport();
        fileManager.export();
    }

}
