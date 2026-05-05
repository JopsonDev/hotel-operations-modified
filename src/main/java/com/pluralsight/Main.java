package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 125);
        System.out.println(room1.isAvailable());
        room1.checkIn();
        System.out.println(room1.isAvailable());
        room1.checkOut();
        System.out.println(room1);
        room1.cleanroom();
        System.out.println(room1);
    }
}
