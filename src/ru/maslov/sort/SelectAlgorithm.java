package ru.maslov.sort;

import java.util.Arrays;

public class SelectAlgorithm extends CommonAlgorithm {

    public SelectAlgorithm(int[] arr) {
        super(arr);
    }

    @Override
    public void execute() {
        int[] arr = getArr();

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            if (index != i) {
                arr[index] += arr[i] - (arr[i] = arr[index]);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
