package ru.maslov;

import java.math.BigInteger;

public class UniquePaths {
    public static void main(String[] args) {
//        new UniquePaths().uniquePaths(9, 4);
        new UniquePaths().uniquePaths(10, 10);
//        new UniquePaths().uniquePaths(5, 5);
    }

    public int uniquePaths(int m, int n) {
        int steps = m + n - 2;

        if (m < n) {
            m += n - (n = m);
        }
        long numerator = 1;
        for (int i = m; i <= steps; i++) {
            numerator *= i;
        }
        long denominator = 1;
        for (int i = n - 1; i > 0; i--) {
            denominator *= i;
        }

        return Math.toIntExact(numerator / denominator);
    }

    public BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
