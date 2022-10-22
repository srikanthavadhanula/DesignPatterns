package com.srikanth.designpatterns.SOLID.dependencyInversion;

public class FlexLaptop {
    private OS os;

    public FlexLaptop(OS os) {
        this.os = os;
    }
}
