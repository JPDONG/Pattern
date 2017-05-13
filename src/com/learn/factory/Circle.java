package com.learn.factory;

import com.learn.Utils.Utils;
import sun.security.provider.SHA;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        Utils.print("drawing circle");
    }
}
