package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        if (roomType.equalsIgnoreCase("King")){
            this.price = 139.00;
        } else if (roomType.equalsIgnoreCase("Double")){
            this.price = 124.00;
        }
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = price * numberOfNights;
        if(isWeekend){
            this.reservationTotal = reservationTotal * 1.1;
        }
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getPrice() {
        return price;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}

