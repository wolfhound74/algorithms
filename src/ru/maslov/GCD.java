package ru.maslov;

import ru.maslov.sort.IAlgorithm;

public class GCD implements IAlgorithm {
    int a;
    int b;

    public GCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        System.out.println(run(a, b));
    }

    private int run(int a, int b) {

        while (true) {
            if (a == 0) return b;
            if (b == 0) return a;

            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }


    }

}
