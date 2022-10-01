package com.srikanth.designpatterns.builderPattern;

public class RoomController {
    public static void main(String[] args) {
        Room room = new Room.builder(2,true).ac(true).wifi(true).build();
        System.out.println("room facilities are : "+room.toString());
    }
}
