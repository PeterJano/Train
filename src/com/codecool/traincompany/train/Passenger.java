package com.codecool.traincompany.train;

public class Passenger extends CanTakePassengers {

    public Passenger() {
        super.ticketPrice = 1.5;
        super.minPassengers = 50;
        super.maxPassengers = 200;
    }
}
