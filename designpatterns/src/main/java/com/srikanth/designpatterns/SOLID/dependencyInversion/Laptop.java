package com.srikanth.designpatterns.SOLID.dependencyInversion;

public class Laptop {
    public WindowsOs os;
    public Laptop(WindowsOs os) {
        this.os = os;
    }
}
