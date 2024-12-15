package com.sherlock.design.structural.decorator.bad;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MonthTime extends TimeLine{
    @Override
    LocalDateTime getTime(LocalDateTime startTime) {
        return startTime.plus(1, ChronoUnit.MONTHS);
    }
}
