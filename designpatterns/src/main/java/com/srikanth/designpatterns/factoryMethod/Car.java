package com.srikanth.designpatterns.factoryMethod;

public class Car extends Vehicle{
    @Override
    public int fetchSeats() {
        return 4;
    }

    @Override
    public boolean isSharingAllowed() {
        return true;
    }
}
