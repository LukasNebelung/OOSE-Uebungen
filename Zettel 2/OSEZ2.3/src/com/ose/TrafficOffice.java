package com.ose;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nico on 05/05/17.
 */

public class TrafficOffice {
    private List<Car> cars = new ArrayList<>(100);

    public void registerCar(Car c) {
        cars.add(c);
    }

    @Nullable
    public Car getCar(String licensePlate) {
        for (Car c : cars) {
            if (c.getLicensePlate().equals(licensePlate)) {
                return c;
            }
        }
        return null;
    }
}
