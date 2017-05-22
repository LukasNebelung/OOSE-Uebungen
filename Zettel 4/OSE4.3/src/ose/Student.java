package ose;

/**
 * Created by nico on 22/05/17.
 */
public class Student {

    public void eat(Food food) {
        System.out.println("I like " + food.getMeal());
    }
    public void eat(Cauliflower Cauliflower) {
        System.out.println("I don’t like " + Cauliflower.getMeal());
    }
}
