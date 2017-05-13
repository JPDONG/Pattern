package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
