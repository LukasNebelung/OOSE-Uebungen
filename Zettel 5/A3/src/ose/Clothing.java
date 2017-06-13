package ose;

/**
 * Created by nico on 13/06/17.
 */
public class Clothing extends Product {
    String material;
    int size;


    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " - Größe " + size + " aus " + material;
    }
}
