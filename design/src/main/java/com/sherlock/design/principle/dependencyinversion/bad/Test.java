package com.sherlock.design.principle.dependencyinversion.bad;

public class Test {

    public static void main(String[] args) {
        DoImport doImport = new DoImport();
        doImport.run();
    }

}
