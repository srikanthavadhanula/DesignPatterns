package com.srikanth.designpatterns.abstractFactoryMethod;

public class MacButtons implements Buttons{
    @Override
    public String getMinimizeLocation() {
        return "leftTop";
    }

    @Override
    public String getCloseLocation() {
        return "leftTop";
    }
}
