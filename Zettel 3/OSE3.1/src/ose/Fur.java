package ose;

/**
 * Created by nico on 09/05/17.
 */
public class Fur {
    public int length;
    public Fur(int length) {
        this.length = length;
    }
    public String toString() {
        return "Felllaenge: " + length;
    }

    public Fur deepClone() {
        return new Fur(this.length);
    }
}
