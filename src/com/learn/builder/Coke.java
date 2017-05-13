package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4;
    }
}
