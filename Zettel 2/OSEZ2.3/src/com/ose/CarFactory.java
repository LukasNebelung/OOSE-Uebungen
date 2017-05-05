package com.ose;

/**
 * Created by nico on 05/05/17.
 */

public class CarFactory {
    public Car buildCar(String owner, String address) {
        return new Car(randomString(), owner, address);
    }

    private static String randomString() {
        java.util.Random rnd = new java.util.Random(); // oder auch klassenweit
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) ((rnd.nextInt(25) + 65)));
        }
        return sb.toString();
    }
}
