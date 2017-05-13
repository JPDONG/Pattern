package com.learn.Template;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game cricket = new Cricket();

        Game football = new Football();

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 2,
                500, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                cricket.play();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                football.play();
            }
        };
        threadPool.execute(r1);
        threadPool.execute(r2);
    }
}
