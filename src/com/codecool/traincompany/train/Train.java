package com.codecool.traincompany.train;

import com.codecool.traincompany.Company;

public abstract class Train {

    protected int serial;
    protected int cost;
    protected Company company;

    private static int counter = 0;

    public Train() {
        this.serial = counter+1;
        counter++;

    }

    public int getSerial() {
        return serial;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


}
