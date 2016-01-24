package com.lijz.pattern.template;

/**
 * Created by jianzhongli on 16/1/24.
 */
public class GameDemo {

    public static void main(String[] args){

        FootballGame footballGame = new FootballGame();
        footballGame.play();

        BasketBallGame basketBallGame = new BasketBallGame();
        basketBallGame.play();
    }
}
