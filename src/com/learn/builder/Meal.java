package com.learn.builder;

import com.learn.Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dong on 2017/4/4 0004.
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void add(Item item) {
        itemList.add(item);
    }

    public void showItems() {
        for (Item item:itemList) {
            Utils.print("name: " + item.name());
            Utils.print("pack: " + item.packing().pack());
            Utils.print("price: " + item.price());
        }
    }

    public float cost() {
        float cost = 0;
        for(Item item:itemList) {
            cost += item.price();
        }
        return cost;
    }
}
