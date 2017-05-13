package com.learn.factory;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        Utils.print("drawing rectangle");
    }
}
