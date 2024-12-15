package com.sherlock.design.structural.decorator.good;

import java.time.LocalDateTime;

public class TimeLineDecorator extends TimeLine{

    private TimeLine timeLine;

    public TimeLineDecorator(TimeLine timeLine) {
        this.timeLine = timeLine;
    }

    @Override
    LocalDateTime getTime(LocalDateTime startTime) {
        return timeLine.getTime(startTime);
    }
}
