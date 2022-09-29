package com.srikanth.designpatterns.abstractFactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppController {
    private static Client configureApp() throws IOException {
        AbstractApp appConfig;
        System.out.print("Enter the OS: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String OS=br.readLine();
        if(OS.contains("MAC")) {
            appConfig = new MacApp();
        } else {
            appConfig = new WindowsApp();
        }
        Client app = new Client(appConfig);
        return app;
    }

    public static void main(String[] args) throws IOException {
        Client app = configureApp();
        app.openApp();
    }
}
