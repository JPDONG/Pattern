package com.learn.factory;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        Utils.print("drawing square");
    }
}
