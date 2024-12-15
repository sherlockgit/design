package com.sherlock.design.structural.decorator.good;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MonthTimeDecorator extends TimeLineDecorator{
    public MonthTimeDecorator(TimeLine timeLine) {
        super(timeLine);
    }

    @Override
    LocalDateTime getTime(LocalDateTime startTime) {
        return super.getTime(startTime).plus(1, ChronoUnit.MONTHS);
    }
}
