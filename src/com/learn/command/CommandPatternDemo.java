package com.learn.command;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Order buyOrder = new BuyStock(stock);
        Order sellOrder = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        broker.placeOrders();
    }
}
