package com.srikanth.designpatterns.factoryMethod;

public class VehicleCreationFactory {

    public Vehicle createVehicleObject(String vehicle) {
        if(vehicle.equals("BIKE")) {
            return new Bike();
        } else {
            return new Car();
        }
    }

}
