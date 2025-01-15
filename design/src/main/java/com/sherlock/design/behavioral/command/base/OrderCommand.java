package com.sherlock.design.behavioral.command.base;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 15:35
 */
@Slf4j
public class OrderCommand implements Command{
    @Override
    public void execute() {
        log.info("订购设备套餐");
    }
}
