package com.codecool.traincompany.train;

import com.codecool.traincompany.util.MyRandom;

public abstract class CanTakePassengers extends Train {

    protected int numOfPassengers;
    protected double ticketPrice;
    protected int minPassengers;
    protected int maxPassengers;


    public void setNumOfPassengers() {
        this.numOfPassengers = MyRandom.getRandom().nextInt(maxPassengers - minPassengers) + minPassengers;

    }


    public double calculateDailyIncome() {
        setNumOfPassengers();
        return (numOfPassengers * ticketPrice) + ((numOfPassengers / 4) * 2);
    }

}
