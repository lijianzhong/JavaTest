package com.lijz.pattern.command;

/**
 * Created by jianzhongli on 15/12/7.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
