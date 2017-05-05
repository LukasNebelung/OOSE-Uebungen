package com.ose;

public class Main {
    // funktioniert nur für kleinere Werte von n. Reicht z.b bei weitem nicht um 49! auszurechnen.
    public static void main(String[] args) {
        long n = Long.getLong(args[0]);
        long k = Long.getLong(args[1]);

        System.out.println("Fakultät von " + n + ": " + fakultät(n));
        System.out.println("Fakultät von " + k + ": " + fakultät(n));
        System.out.println(n + " über " + k + ": " + binomialKoeffizient(n, k));
        System.out.println(n + " und " + k + " Lottolösung: " + modLottoProblem(n, k));
    }

    public static long fakultät(long n) {
        return n > 1 ? n * fakultät(--n) : n == 1 ? 1 : 0;
    }

    public static long binomialKoeffizient(long n, long k) {
        return (((0 <= n) && n <= k) || (n < 0) || (k < 0)) ? 0 : (fakultät(n) / (fakultät(n - k) * fakultät(k)));
    }

    public static long modLottoProblem(long n, long k) {
        return binomialKoeffizient(n, k) * fakultät(k);
    }

}