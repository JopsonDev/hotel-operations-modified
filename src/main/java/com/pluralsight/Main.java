package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Room room1 = new Room(1, 125);
        System.out.println(room1.isAvailable());
        room1.checkIn();
        System.out.println(room1.isAvailable());
        room1.checkOut();
        System.out.println(room1);
        room1.cleanroom();
        System.out.println(room1);

        Employee e1 = new Employee(1, "John", "IT", 10.00, 0);
        e1.punchTimeCard(scanner);

        System.out.println(e1.getRegularHours());
    }
}
