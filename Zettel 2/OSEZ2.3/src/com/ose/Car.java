package com.ose;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String licensePlate;
    private String owner;
    private String address;
    public List<Delict> delicts = new ArrayList<>(5);

    public Car(String licensePlate, String owner, String address) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.address = address;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    public void registerDelict(Delict del) {
        delicts.add(del);
    }

    public void printDelicts() {
        for (Delict del : delicts) {
            System.out.println("Delikt " + (delicts.indexOf(del) + 1));
            System.out.println("Points : " + del.getPoints());
            System.out.println("Fees : " + del.getFees());
        }
    }
}
