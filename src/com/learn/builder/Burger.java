package com.learn.builder;

/**
 * Created by dong on 2017/4/4 0004.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
