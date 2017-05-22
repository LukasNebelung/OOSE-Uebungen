package ose;

import java.util.Arrays;

/**
 * Created by nico on 22/05/17.
 */
public class Matrix2D {
    public double[][] values = new double[2][2];

    public Matrix2D(double x1, double x2, double y1, double y2) {
        values[0][0] = x1;
        values[1][0] = x2;
        values[0][1] = y1;
        values[1][1] = y2;
    }

    public Object applyOperator(Operator o){
        return o.execute(this);
    }

    @Override
    public String toString() {
        return "Matrix:  (" + values[0][0] + ", " + values[0][1] + ", " + values[1][0] + ", "+ values[1][1]+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix2D matrix2D = (Matrix2D) o;

        return Arrays.deepEquals(values, matrix2D.values);
    }
}
