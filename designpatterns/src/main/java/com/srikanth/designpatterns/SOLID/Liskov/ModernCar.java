package com.srikanth.designpatterns.SOLID.Liskov;

public class ModernCar implements Car{
    private Engine engine;
    @Override
    public void onEngine() {
        engine.onEngine();
    }
    @Override
    public void switchGear() {
        throw new AssertionError("I don't have an engine!");
    }
    @Override
    public void accelerate() {
        engine.accelerate();
    }
}
