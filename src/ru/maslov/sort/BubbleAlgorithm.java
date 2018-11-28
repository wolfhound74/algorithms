package ru.maslov.sort;

import java.util.Arrays;

public class BubbleAlgorithm extends CommonAlgorithm {

    public BubbleAlgorithm(int[] arr) {
        super(arr);
    }

    public void execute() {
        int[] arr = getArr();
        boolean exec;
        do {
            exec = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] += arr[i + 1] - (arr[i + 1] = arr[i]);
                    exec = true;
                }
            }

        } while (exec);

        System.out.println(Arrays.toString(arr));

    }

}
