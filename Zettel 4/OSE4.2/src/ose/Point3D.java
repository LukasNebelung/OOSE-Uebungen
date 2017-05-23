package ose;

/**
 * Created by nico on 22/05/17.
 */
public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public static double distance(Point3D p1, Point3D p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2) + Math.pow(p2.z - p1.z, 2));
    }

    @Override
    public String toString() {
        return "Point3D{" + x + ", " + y + ", " + z + '}';
    }
}
