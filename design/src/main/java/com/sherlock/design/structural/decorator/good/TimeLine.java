package com.sherlock.design.structural.decorator.good;

import java.time.LocalDateTime;

public abstract class TimeLine {

    abstract LocalDateTime getTime(LocalDateTime startTime);

}
