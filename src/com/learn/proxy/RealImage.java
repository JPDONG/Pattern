package com.learn.proxy;

import com.learn.Utils.Utils;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    private void loadImageFromDisk(String fileName) {
        Utils.print("loading from disk. name:" + fileName);
    }

    @Override
    public void disPlay() {
        Utils.print("displying. name:" + fileName);
    }
}
