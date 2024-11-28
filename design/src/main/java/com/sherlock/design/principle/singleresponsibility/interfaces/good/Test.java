package com.sherlock.design.principle.singleresponsibility.interfaces.good;

public class Test {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.export();
        userManager.imports();
    }

}
