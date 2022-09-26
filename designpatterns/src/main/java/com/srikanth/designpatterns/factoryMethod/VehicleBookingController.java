package com.srikanth.designpatterns.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleBookingController {

    public static void main(String[] args) throws IOException {
        VehicleCreationFactory factory = new VehicleCreationFactory();

        System.out.print("Enter the Vehicle name you want to book: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String vehicle=br.readLine();

        Vehicle v = factory.createVehicleObject(vehicle);

        System.out.println("Vehicle that you have booked have "+v.fetchSeats()+" seats.");
    }
}
