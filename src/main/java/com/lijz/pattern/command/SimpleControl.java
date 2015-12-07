package com.lijz.pattern.command;

/**
 * Created by jianzhongli on 15/12/7.
 */
public class SimpleControl {

    private Command command;

    public SimpleControl(){

    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttenPressed(){
        command.execute();
    }
}
