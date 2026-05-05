package com.pluralsight;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return payRate * hoursWorked + (getOvertimeHours() * payRate * 1.5);
    }

    public double getRegularHours(){
        if (hoursWorked > 40){
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours(){
        if (hoursWorked > 40){
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public int punchIn(Scanner scanner){
        System.out.print("Punch In Time (24:00): ");
        return scanner.nextInt();
    }

    public int punchOut(Scanner scanner){
        System.out.print("Punch Out Time (24:00): ");
        return scanner.nextInt();
    }

    public void punchTimeCard(Scanner scanner){
        System.out.print("Punch In Time (10 for 10:00am): ");
        int inTime = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Punch Out Time (14 for 2:00pm): ");
        int outTime = scanner.nextInt();
        scanner.nextLine();
        if (inTime >= outTime){
            outTime += 24;
        }
        double workedTime = outTime - inTime;


        System.out.println("In: " + inTime +"\nOut: " + outTime + "\nHours Worked: " + workedTime);

        hoursWorked = workedTime;
    }



}