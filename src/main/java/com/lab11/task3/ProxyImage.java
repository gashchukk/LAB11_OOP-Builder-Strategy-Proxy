package com.lab11.task3;
import lombok.Getter;

@Getter
public class ProxyImage implements MyImage {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void output() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.output();
    }
}