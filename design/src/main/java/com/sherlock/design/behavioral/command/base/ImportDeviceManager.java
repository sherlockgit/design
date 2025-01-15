package com.sherlock.design.behavioral.command.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/15 15:37
 */
public class ImportDeviceManager {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(){
        for (Command command : commands){
            command.execute();
        }
        commands.clear();
    }

}
