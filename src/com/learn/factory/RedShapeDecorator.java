package com.learn.factory;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        Utils.print("set red border");
    }
}
