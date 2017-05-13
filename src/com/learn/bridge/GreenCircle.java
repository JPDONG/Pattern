package com.learn.bridge;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        Utils.print("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
