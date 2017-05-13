package com.learn.observer;

/**
 * Created by dong on 2017/3/24 0024.
 */
public abstract class MyObserver {

    protected Subject subject;

    public abstract void update();
}
