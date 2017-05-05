package com.ose;

/**
 * Created by nico on 05/05/17.
 */

public class MyProgram {
    public static void main(String[] args) {

        // Auskommentierter Teil ist Aufgabenteil f)
        
        /*Car car1 = new Car("B-KN 4127", "Max M.", "Kreuzbergweg 2");
        Car car2 = new Car("K-LM 5135", "Simon S.", "Roemerstraße 164");
        TrafficOffice to1 = new TrafficOffice();
        to1.registerCar(car1);
        to1.registerCar(car2);
        // Sollte Max M. ausgeben::
        System.out.println(to1.getCar(car1.getLicensePlate()).getOwner());
        car2.registerDelict(new Delict(48.5, 2));
        car2.registerDelict(new Delict(20., 0));
        // Sollte K-LM 5135 und Simon S. ausgeben:
        System.out.println("Delikte f̈ur " + car2.getLicensePlate() + " (" + car2.getOwner() + "):");
        // Sollte die zwei obigen Delikte ausgeben:
        car2.printDelicts();*/

        // CarFactory erst instanzieren
        CarFactory carFactory = new CarFactory();
        // Dann auf der Instanz die buildCar Funktion aufrufen
        Car car1 = carFactory.buildCar("Max M.", "Kreuzbergweg 2");
        Car car2 = carFactory.buildCar("Simon S.", "Roemerstraße 164");
        TrafficOffice to1 = new TrafficOffice();
        to1.registerCar(car1);
        to1.registerCar(car2);
        // Sollte Max M. ausgeben::
        System.out.println(to1.getCar(car1.getLicensePlate()).getOwner());
        car2.registerDelict(new Delict(48.5, 2));
        car2.registerDelict(new Delict(20., 0));
        // Sollte ein zuälliges Kennzeichen und Simon S. ausgeben:
        System.out.println("Delikte f̈ur " + car2.getLicensePlate() + " (" + car2.getOwner() + "):");
        // Sollte die zwei obigen Delikte ausgeben:
        car2.printDelicts();
    }
}
