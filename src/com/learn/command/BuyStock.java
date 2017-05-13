package com.learn.command;

/**
 * Created by dong on 2017/3/26 0026.
 */
public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
