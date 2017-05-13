package com.learn.observer;

/**
 * Created by dong on 2017/3/24 0024.
 */
public class OctalObserver extends MyObserver {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
