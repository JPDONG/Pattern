package com.learn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dong on 2017/3/24 0024.
 */
public class Subject {

    private int state;

    private List<MyObserver> myObserverList = new ArrayList<>();

    public void attach(MyObserver observer) {
        myObserverList.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (MyObserver observer:myObserverList) {
            observer.update();
        }
    }
}
