package com.srikanth.designpatterns.SOLID.Liskov;

public class DeluxeCar implements Car{
    private Engine engine;
    @Override
    public void onEngine() {
        engine.onEngine();
    }
    @Override
    public void switchGear() {
        engine.switchGear();
    }
    @Override
    public void accelerate() {
        engine.accelerate();
    }
}
