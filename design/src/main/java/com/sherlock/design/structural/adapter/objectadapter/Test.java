package com.sherlock.design.structural.adapter.objectadapter;

import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.xml.sax.helpers.XMLReaderAdapter;

public class Test {
    public static void main(String[] args) {
        TargetReport targetReport = new ADevice();
        TargetReport BDeviceReport = new BReportAdapter();
        Reporter.toReport(targetReport);
        Reporter.toReport(BDeviceReport);
    }

}
