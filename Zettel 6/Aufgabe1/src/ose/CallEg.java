package ose;

/**
 * Created by Keridos on 21/06/17.
 * This Class
 */
public class CallEg {
    public void methodA() throws ArithmeticException {
            methodB();

    }

    public void methodB() throws ArithmeticException {

            methodC();

    }

    public void methodC() throws ArithmeticException {
        int a = 1 / 0;
    }
}
