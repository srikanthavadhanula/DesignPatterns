package com.srikanth.designpatterns.abstractFactoryMethod;

public class WindowsApp implements AbstractApp{
    @Override
    public Layout createLayout() {
        return new WinLayout();
    }

    @Override
    public Buttons createButtons() {
        return new WinButtons();
    }
}
