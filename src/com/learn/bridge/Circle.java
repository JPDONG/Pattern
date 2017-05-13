package com.learn.bridge;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class Circle extends Shape {

    int r,x,y;

    public Circle(int r, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(r, x, y);
    }
}
