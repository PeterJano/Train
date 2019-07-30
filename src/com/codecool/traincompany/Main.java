package com.codecool.traincompany;

import com.codecool.traincompany.train.Freight;
import com.codecool.traincompany.train.IC;
import com.codecool.traincompany.train.Passenger;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

//        Passenger passenger = new Passenger();
//        IC ic = new IC();
//        Freight freight = new Freight();
        company.addTrain(new Passenger());
        company.addTrain(new IC());
        company.addTrain(new Freight());
        company.addTrain(new Passenger());
        company.addTrain(new IC());
        company.addTrain(new Freight());

        company.simulate(24);

        System.out.println("2 years of income: " + company.getMoney());

    }



}
