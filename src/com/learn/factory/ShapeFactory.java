package com.learn.factory;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class ShapeFactory {

    public Shape getShape(String name) {
        if (name == null) {
            return null;
        }
        if ("circle".equalsIgnoreCase(name)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(name)) {
            return new Square();
        } else if ("rectangle".equalsIgnoreCase(name)) {
            return new Rectangle();
        }
        return null;
    }
}
