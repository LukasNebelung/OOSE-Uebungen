package ose;

/**
 * Created by nico on 09/05/17.
 */
public class Sheep {
    public String name;
    public Fur fur;

    public Sheep(String name, Fur fur) {
        this.name = name;
        this.fur = fur;
    }

    public void shear() {
        fur.length = 0;
    }

    public String toString() {
        return "Name: " + name + " " + fur.toString();
    }

    public Sheep clone() {
        return this;
    }

    public Sheep shallowClone() {
        return new Sheep(this.name, this.fur);
    }

    public Sheep deepClone() {
        return new Sheep(this.name, this.fur.deepClone());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Sheep) {
            Sheep sheep = (Sheep) o;
            if (sheep.name.equals(this.name) && sheep.fur.length == this.fur.length){
                return true;
            }
        }
        return false;
    }
}
