package com.learn.adapter;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class MP4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String name) {

    }

    @Override
    public void playMP4(String name) {
        Utils.print("playing mp4 file. name:" + name);
    }
}
