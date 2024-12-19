package com.sherlock.design.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        TargetReport targetReport = new ADevice();
        TargetReport BDeviceReport = new BReportAdapter();
        Reporter.toReport(targetReport);
        Reporter.toReport(BDeviceReport);

    }

}
