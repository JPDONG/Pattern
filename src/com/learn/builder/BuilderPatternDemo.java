package com.learn.builder;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        Utils.print("Ver Meal");
        vegMeal.showItems();
        Utils.print("Total cost : " + vegMeal.cost());

        Meal novegMeal = mealBuilder.prepareNoVegMeal();
        Utils.print("No Veg Meal");
        novegMeal.showItems();
        Utils.print("Total cost:" + novegMeal.cost());

    }
}
