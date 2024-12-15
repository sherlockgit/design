package com.sherlock.design.structural.decorator.good;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
@Slf4j
public class Test {

    public static void main(String[] args) {
        TimeLine timeLine ;
        timeLine = new TimeLineEntity();
        timeLine = new MonthTimeDecorator(timeLine);
        timeLine = new MonthTimeDecorator(timeLine);
        timeLine = new DayTimeDecorator(timeLine);
        log.info("时间线：{}",timeLine.getTime(LocalDateTime.now()));
    }

}
