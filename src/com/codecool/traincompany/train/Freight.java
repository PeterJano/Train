package com.codecool.traincompany.train;

import com.codecool.traincompany.util.MyRandom;

public class Freight extends Train {

    private int revenue;


    public int getRevenue() {
        return revenue;
    }

    public boolean isAbroad() {



        int num = MyRandom.getRandom().nextInt(100);

        if (num < 35) {
            return true;
        } else {
            return false;
        }


    }

    public int calculateMonthlyRevenue() {
        if(isAbroad()) {
            return revenue = 660;
        }
        else {
            return revenue = 550;
        }
    }
}
