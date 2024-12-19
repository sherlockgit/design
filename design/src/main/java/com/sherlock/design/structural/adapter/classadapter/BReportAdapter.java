package com.sherlock.design.structural.adapter.classadapter;

public class BReportAdapter extends BDevice implements TargetReport {
    @Override
    public void report() {
        super.post();
    }
}
