package ose;

/**
 * Created by nico on 22/05/17.
 */
public class symmetryOperator implements Operator {
    @Override
    public Object execute(Matrix2D matrix2D) {
        return matrix2D.equals(matrix2D.applyOperator(new transposeOperator()));
    }
}
