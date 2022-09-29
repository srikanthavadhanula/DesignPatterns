package com.srikanth.designpatterns.abstractFactoryMethod;

public class MacLayout implements Layout{
    @Override
    public int getSize() {
        return 5;
    }

    @Override
    public String getNavBar() {
        return "left";
    }
}
