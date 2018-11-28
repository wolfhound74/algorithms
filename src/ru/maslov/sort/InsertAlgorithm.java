package ru.maslov.sort;

import java.util.Arrays;

public class InsertAlgorithm extends CommonAlgorithm {
    public InsertAlgorithm(int[] arr) {
        super(arr);
    }

    @Override
    public void execute() {
        int[] arr = getArr();

        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {

            int el = arr[i];

            for (int j = i - 1; j >= 0 && el < arr[j]; j--) {
                arr[j + 1] = arr[j];
                arr[j] = el;
            }
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(arr) + " " + finish + "ms");
    }
}
