package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VergerBurger";
    }

    @Override
    public float price() {
        return 10;
    }
}
