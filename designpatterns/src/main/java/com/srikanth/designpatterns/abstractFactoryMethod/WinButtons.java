package com.srikanth.designpatterns.abstractFactoryMethod;

public class WinButtons implements Buttons{
    @Override
    public String getMinimizeLocation() {
        return "rightTop";
    }

    @Override
    public String getCloseLocation() {
        return "rightTop";
    }
}
