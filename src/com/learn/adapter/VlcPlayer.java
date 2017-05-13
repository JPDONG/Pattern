package com.learn.adapter;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String name) {
        Utils.print("playing vlc file. name:" + name);
    }

    @Override
    public void playMP4(String name) {

    }
}
