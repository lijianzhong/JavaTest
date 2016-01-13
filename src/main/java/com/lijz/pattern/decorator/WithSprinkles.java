package com.lijz.pattern.decorator;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class WithSprinkles extends CoffeeDecorator {

    public WithSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ":" + " with sprinkles";
    }
}
