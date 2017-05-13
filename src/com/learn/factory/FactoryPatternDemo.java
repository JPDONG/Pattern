package com.learn.factory;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class FactoryPatternDemo {


    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape0 = shapeFactory.getShape("circle");
        shape0.draw();
        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        /*Shape shape3 = shapeFactory.getShape("circlee");
        shape3.draw();*/
        Shape shape4 = new RedShapeDecorator(shape0);
        shape4.draw();

    }
}
