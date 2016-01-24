package com.lijz.pattern.template;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class FootballGame extends Game {

    @Override
    public void initialize() {
        System.out.println("foot ball game initialize");
    }

    @Override
    public void start() {
        System.out.println("foot ball game start");
    }

    @Override
    public void end() {
        System.out.println("foot ball end");
    }
}
