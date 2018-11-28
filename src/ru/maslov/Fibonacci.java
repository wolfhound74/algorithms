package ru.maslov;

import ru.maslov.sort.IAlgorithm;

public class Fibonacci implements IAlgorithm {

    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public void execute() {
        long start = System.currentTimeMillis();
        System.out.println(fibonacci(n));
        System.out.println(System.currentTimeMillis() - start + " ms");

    }

    // 0 1 1 2 3 5 8 13 21
    private int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a + b;

            a = b;
            b = c;
            System.out.println("--- " + a);
        }


        return a;
    }
}
