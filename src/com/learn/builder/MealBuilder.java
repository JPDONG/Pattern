package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal1 = new Meal();
        meal1.add(new VegBurger());
        meal1.add(new Coke());
        return meal1;
    }

    public Meal prepareNoVegMeal() {
        Meal meal2 = new Meal();
        meal2.add(new ChickenBurger());
        meal2.add(new Pepsi());
        return meal2;
    }
}
