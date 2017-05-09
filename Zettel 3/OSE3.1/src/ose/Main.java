package ose;

public class Main {

    public static void main(String[] args) {
	    Sheep sheep = new Sheep("Petra", new Fur(10));
	    Sheep clonedSheep = sheep.clone();
        System.out.println("Aufgabe 1. a)");
	    System.out.println(sheep.toString());
        System.out.println(clonedSheep.toString());
        clonedSheep.name = "Ella";
        clonedSheep.shear();
        System.out.println(sheep.toString());
        System.out.println(clonedSheep.toString());
        /*  Beide Schafe wurden umbenannt und geschert. Wir haben nur shallow geklont, es wurden daher
            nur die Referenzen auf die Objekte kopiert, keine neuen Instanzen dafür angelegt.
        */
        sheep = new Sheep("Petra", new Fur(10));
        clonedSheep = sheep.deepClone();
        System.out.println("Aufgabe 1. b)");
        System.out.println(sheep.toString());
        System.out.println(clonedSheep.toString());
        clonedSheep.name = "Ella";
        clonedSheep.shear();
        System.out.println(sheep.toString());
        System.out.println(clonedSheep.toString());
        /*  Da wir jetzt deep clonen (also auch alle Subobjekte klonen können wir die Werte des geklonten
            Schafs ändern ohne Auswirkungen auf das Original Schaf zu haben.


            Zu d):
            Ein Interface ist eine Art "Vertrag" mit dem wir angeben, dass unsere Klasse etwas kann
            (zum Beispiel eine bestimmte Funktion implementiert (per @Override). Das Cloneable Interface besagt,
            dass wir in der Klasse die Funktion clone() overriden und eine korrekte deep cloning funktion in
            dieser implementieren.
        */
    }
}
