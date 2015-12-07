package com.lijz.pattern.command;

/**
 * Created by jianzhongli on 15/12/7.
 */
public class LightOnCommand implements  Command{

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
