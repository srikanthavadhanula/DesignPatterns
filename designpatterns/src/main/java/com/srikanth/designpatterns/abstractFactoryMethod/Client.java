package com.srikanth.designpatterns.abstractFactoryMethod;

public class Client {

    private Layout layout;
    private Buttons buttons;

    public Client(AbstractApp app) {
        this.layout = app.createLayout();
        this.buttons = app.createButtons();
    }

    public void openApp() {
        System.out.println("I am able to open my app");
        System.out.println("layout of my App \n Screen size : "+layout.getSize()+" , NavBar : "+layout.getNavBar());
        System.out.println("Buttons of my App \n minimize : "+buttons.getMinimizeLocation()+" , close : "+buttons.getCloseLocation());
    }
}
