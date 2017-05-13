package com.learn.observer;

/**
 * Created by dong on 2017/3/24 0024.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setState(10);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        subject.setState(11);
    }
}
