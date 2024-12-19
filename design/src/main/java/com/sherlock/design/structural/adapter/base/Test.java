package com.sherlock.design.structural.adapter.base;

public class Test {
    public static void main(String[] args) {
        TargetReport targetReport = new ADevice();
        Reporter.toReport(targetReport);
    }

}
