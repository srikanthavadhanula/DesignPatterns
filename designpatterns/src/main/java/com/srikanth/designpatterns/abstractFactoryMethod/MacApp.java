package com.srikanth.designpatterns.abstractFactoryMethod;

public class MacApp implements AbstractApp{
    @Override
    public Layout createLayout() {
        return new MacLayout();
    }

    @Override
    public Buttons createButtons() {
        return new MacButtons();
    }
}
