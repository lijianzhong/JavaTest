package com.lijz.pattern.command;

/**
 * Created by jianzhongli on 15/12/7.
 */
public class SimpleControlTest {

    public static void main(String[] args){
        Light light = new Light();
        Command command = new LightOnCommand(light);
        SimpleControl simpleControl = new SimpleControl();
        simpleControl.setCommand(command);
        simpleControl.buttenPressed();

        command = new LightOffCommand(light);
        simpleControl.setCommand(command);
        simpleControl.buttenPressed();
    }
}
