package com.srikanth.designpatterns.abstractFactoryMethod;

public class WinLayout implements Layout{
    @Override
    public int getSize() {
        return 8;
    }

    @Override
    public String getNavBar() {
        return "right";
    }
}
