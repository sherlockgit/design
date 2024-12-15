package com.sherlock.design.structural.decorator.bad;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class Test {
    public static void main(String[] args) {
        TimeLine monthTime = new MonthTime();
        log.info("时间线：{}",monthTime.getTime(LocalDateTime.now()));

        TimeLine dayTime = new DayTime();
        log.info("时间线：{}",dayTime.getTime(LocalDateTime.now()));
    }

}
