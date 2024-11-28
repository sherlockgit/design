package com.sherlock.design.principle.singleresponsibility.interfaces.bad;

public class Test {

    public static void main(String[] args) {
        FileManager fileManager = new UserExport();
        fileManager.imports();
        fileManager.export();
    }

}
