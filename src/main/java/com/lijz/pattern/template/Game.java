package com.lijz.pattern.template;

/**
 * Created by jianzhongli on 16/1/24.
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void start();

    public abstract void end();

    public void play(){

        initialize();
        start();
        end();
    }
}
