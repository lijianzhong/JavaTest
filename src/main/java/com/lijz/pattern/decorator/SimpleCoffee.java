package com.lijz.pattern.decorator;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 0.5;
    }

    @Override
    public String getIngredients() {
        return "simple coffee";
    }
}
