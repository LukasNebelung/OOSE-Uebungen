package ose;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Cauliflower essen1 = new Cauliflower();
        student.eat(essen1);
        Spaghetti essen2 = new Spaghetti();
        student.eat(essen2);
        Food essen = new Cauliflower();
        student.eat(essen);

        /*  essen1 gibt I don' like zurück, da wir mit "Cauliflower essen1" den Typ auf Cauliflower gesetzt haben und damit
            die Funktion eat(Cauliflower cauliflower) ansprechen. essen2 ist nicht cauliflower und  daher wird die eat(Food)
            hierbei angewendet. Da essen von Typ Food ist, spricht diese Funktion auch die Funktion eat(Food) an, auch
            wenn der eigentliche Typ Cauliflower ist.
        */
    }
}
