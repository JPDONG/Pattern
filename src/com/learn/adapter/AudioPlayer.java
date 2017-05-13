package com.learn.adapter;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            Utils.print("playing mp3 file. name:" + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
           mediaAdapter = new MediaAdapter(audioType);
           mediaAdapter.play(audioType, fileName);
        } else {
            Utils.print("invalid file");
        }
    }
}
