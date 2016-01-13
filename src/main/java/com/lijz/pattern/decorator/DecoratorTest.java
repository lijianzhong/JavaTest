package com.lijz.pattern.decorator;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class DecoratorTest {

    public static void main(String[] args){
        Coffee coffee = new SimpleCoffee();

        WithMilk withMilk = new WithMilk(coffee);
        System.out.println(withMilk.getCost() + ":" + withMilk.getIngredients());

        WithSprinkles withSprinkles = new WithSprinkles(coffee);
        System.out.println(withSprinkles.getCost() + ":" + withSprinkles.getIngredients());
    }
}
