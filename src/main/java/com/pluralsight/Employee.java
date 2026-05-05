package com.pluralsight;

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

}