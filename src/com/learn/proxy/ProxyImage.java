package com.learn.proxy;

/**
 * Created by dong on 2017/3/25 0025.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String name) {
        this.fileName = name;
    }

    @Override
    public void disPlay() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.disPlay();
    }
}
