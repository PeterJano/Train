package com.codecool.traincompany;

import com.codecool.traincompany.train.*;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Train> trains = new ArrayList<>();

    public List<CanTakePassengers> passengerTrains = new ArrayList<>();

    public List<Freight> freightTrains = new ArrayList<>();

    public void addTrain(Train train) {

        trains.add(train);
        if(train instanceof CanTakePassengers) {
            passengerTrains.add((CanTakePassengers) train);

        }
        else {
            freightTrains.add((Freight) train);
        }
        train.setCompany(this);
    }
    public void simulate(int month) {
        for (Train train:trains) {
            System.out.println(train.getSerial());

        }

        for (int i = 0; i < month; i++) {
            simulateAMonth();

        }

    }

    private double simulateADay() {
        double dailyIncome = 0;
        for (int i = 0; i < passengerTrains.size(); i++) {
            dailyIncome += passengerTrains.get(i).calculateDailyIncome();
        }
        return dailyIncome;

    }


    private void simulateAMonth() {
        float monthlyIncome = 0;
        for (int i = 0; i < 30; i++) {
            monthlyIncome += simulateADay();

        }
        for (int i = 0; i < freightTrains.size(); i++) {
            monthlyIncome += freightTrains.get(i).calculateMonthlyRevenue();

        }
        System.out.println("The monthly income was:" + monthlyIncome);
        setMoney(getMoney() + monthlyIncome);
    }
}
