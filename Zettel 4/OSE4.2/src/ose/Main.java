package ose;

public class Main {

    public static void main(String[] args) {
	    Point p1 = new Point(0,0);
	    Point p2 = new Point(1,1);
	    System.out.println("Distance = " + Point.distance(p1, p2));
        System.out.println(p1.toString() + ", " + p2.toString());
        Point3D p3 = new Point3D(0,0,0);
        Point3D p4 = new Point3D(1,1,1);
        System.out.println("Distance = " + Point3D.distance(p3, p4));
        System.out.println(p3.toString() + ", " + p4.toString());
    }
}
