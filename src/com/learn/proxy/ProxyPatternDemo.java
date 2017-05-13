package com.learn.proxy;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("www.jpg");
        image.disPlay();
        image.disPlay();
    }
}
