package ose;

/**
 * Created by nico on 13/06/17.
 */
public class Product {
    String name;
    String description;
    double price; // Netto
    public Product(String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }
    public final double getPriceWithTax() {
        return price * 1.19;
    }
    public String toString() {
        return name + " - " + description + " - " + price + " EUR";
    }
}