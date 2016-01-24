package com.lijz.pattern.template;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class BasketBallGame extends Game {

    @Override
    public void initialize() {
        System.out.println("basket ball initialize");
    }

    @Override
    public void start() {

        System.out.println("basket ball start");
    }

    @Override
    public void end() {

        System.out.println("basket ball end");
    }
}
