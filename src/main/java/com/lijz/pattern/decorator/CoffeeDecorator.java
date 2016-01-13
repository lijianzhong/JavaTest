package com.lijz.pattern.decorator;

/**
 * Created by jianzhongli on 16/1/13.
 */
public abstract class CoffeeDecorator implements Coffee{

    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
