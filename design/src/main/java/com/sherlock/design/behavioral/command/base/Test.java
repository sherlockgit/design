package com.sherlock.design.behavioral.command.base;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 15:40
 */
public class Test {

    public static void main(String[] args) {
        Command importDeviceCommand = new ImportDeviceCardCommand();
        Command importDeviceCardCommand = new ImportDeviceCardCommand();
        Command orderCommand = new OrderCommand();
        ImportDeviceManager manager = new ImportDeviceManager();
        manager.addCommand(importDeviceCommand);
        manager.addCommand(importDeviceCardCommand);
        manager.addCommand(orderCommand);
        manager.executeCommand();
    }

}
