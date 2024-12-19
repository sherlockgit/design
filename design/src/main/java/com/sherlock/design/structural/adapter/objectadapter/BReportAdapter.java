package com.sherlock.design.structural.adapter.objectadapter;

import com.sherlock.design.structural.adapter.classadapter.AdapteeReport;
import com.sherlock.design.structural.adapter.classadapter.BDevice;

public class BReportAdapter implements TargetReport {

    private AdapteeReport adapteeReport = new BDevice();

    @Override
    public void report() {
        adapteeReport.post();;
    }
}
