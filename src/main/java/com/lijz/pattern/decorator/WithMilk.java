package com.lijz.pattern.decorator;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ":" + " with milk";
    }
}
