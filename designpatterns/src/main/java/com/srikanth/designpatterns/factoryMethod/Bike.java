package com.srikanth.designpatterns.factoryMethod;

public class Bike extends Vehicle {

    @Override
    public int fetchSeats() {
        return 1;
    }

    @Override
    public boolean isSharingAllowed() {
        return false;
    }
}
