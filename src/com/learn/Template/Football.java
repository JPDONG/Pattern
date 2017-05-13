package com.learn.Template;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class Football extends Game{
    @Override
    void initialize() {
        Utils.print("initialize football " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void startPlay() {
        Utils.print("play football " + Thread.currentThread().getId());
    }

    @Override
    void endPlay() {
        Utils.print("football over " + Thread.currentThread().getId());
    }
}
