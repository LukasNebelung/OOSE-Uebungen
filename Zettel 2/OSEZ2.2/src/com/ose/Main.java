package com.ose;

public class Main {

    public static void main(String[] args) {
        boolean sixPointFour = (6.4 == 6.4f);
        boolean sixPointFive = (6.5 == 6.5f);
        System.out.println("6.4 and 6.4f equality: " + sixPointFour);
        System.out.println("6.5 and 6.5f equality: " + sixPointFive);

        /*
        Wenn die floating point nummer dargestellt wird, kann sie bei bestimmen Werten abweichen, da sie immer durch
        einen exponenten, der mit einer arithmetischen serie (z.B. 0.5¹ + 0.5² +... + 0.5^23). Dadurch endstehen Lücken
        in den möglichen Werten für eine Fließkommazahl. 6.4f fällt genau in eine solche Lücke, während 6.5 in keiner
        Lücke ist. Das liegt daran, dass 0.5 immer durch eine division mit 2 dargestellt werden kann und 2 eine Zahl ist,
        die als 2^x darstellbar ist.
         */
    }
}
