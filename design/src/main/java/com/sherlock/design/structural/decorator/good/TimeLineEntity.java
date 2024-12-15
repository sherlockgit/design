package com.sherlock.design.structural.decorator.good;

import java.time.LocalDateTime;

public class TimeLineEntity extends TimeLine {


    @Override
    LocalDateTime getTime(LocalDateTime startTime) {
        return startTime;
    }
}
