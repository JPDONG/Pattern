package com.learn.bridge;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        DrawAPI drawAPI = new RedCircle();
        Shape shape = new Circle(1,2,3,drawAPI);
        shape.draw();
    }
}
