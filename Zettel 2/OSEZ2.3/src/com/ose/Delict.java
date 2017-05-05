package com.ose;

/**
 * Created by nico on 05/05/17.
 */

public class Delict {
    private double fees;
    private int points;

    public Delict(double fees, int points) {
        this.fees = fees;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public double getFees() {
        return fees;
    }
}