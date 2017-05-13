package com.learn.observer;

/**
 * Created by dong on 2017/3/24 0024.
 */
public class BinaryObserver extends MyObserver {

    public BinaryObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
