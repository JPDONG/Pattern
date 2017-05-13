package com.learn.command;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        Utils.print("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell() {
        Utils.print("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
