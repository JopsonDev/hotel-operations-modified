package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false; //both these start at false because when being first added the rooms are clean and unoccupied. once they're you adjust with a setter
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    } //will return true if both are false

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void checkIn(){
        isDirty = true;
        isOccupied = true;
    }

    public void checkOut(){
        isOccupied = false;
    }

    public void cleanroom(){
        if (!isOccupied){
            isDirty = false;
            isAvailable = true;
        } else {
            System.out.println("Room Occupied");
        }
    }

    @Override
    public String toString() {
        return "Room:\n" +
                "Available = " + isAvailable +
                "\nnumberOfBeds = " + numberOfBeds +
                "\nprice = " + price +
                "\nisOccupied = " + isOccupied +
                "\nisDirty = " + isDirty;
    }
}
