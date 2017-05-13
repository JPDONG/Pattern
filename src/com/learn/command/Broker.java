package com.learn.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        int len = orders.size();
        for(int i = 0; i < len; i++) {
            orders.get(i).execute();
        }
        orders.clear();
    }
}
