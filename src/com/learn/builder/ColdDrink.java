package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
