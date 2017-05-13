package com.learn.observer;

/**
 * Created by dong on 2017/3/24 0024.
 */
public class HexaObserver extends MyObserver {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String:" + Integer.toHexString(subject.getState()));
    }
}
