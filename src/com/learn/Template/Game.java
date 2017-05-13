package com.learn.Template;

/**
 * Created by dong on 2017/3/25 0025.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
