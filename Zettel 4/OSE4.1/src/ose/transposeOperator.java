package ose;

/**
 * Created by nico on 22/05/17.
 */
public class transposeOperator implements Operator {
    @Override
    public Object execute(Matrix2D matrix2D) {
        return new Matrix2D(matrix2D.values[0][0],matrix2D.values[0][1],matrix2D.values[1][0],matrix2D.values[1][1]);
    }
}
