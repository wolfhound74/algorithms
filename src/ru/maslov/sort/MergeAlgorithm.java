package ru.maslov.sort;

import java.util.Arrays;

public class MergeAlgorithm extends CommonAlgorithm {
    public MergeAlgorithm(int[] arr) {
        super(arr);
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(sort(getArr())));
    }

    private int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int half = arr.length / 2;

        int[] leftArr = Arrays.copyOfRange(arr, 0, half);
        int[] rightArr = Arrays.copyOfRange(arr, half, arr.length);

        return mergeArr(
                sort(leftArr),
                sort(rightArr)
        );
    }

    private int[] mergeArr(int[] leftArr, int[] rightArr) {
        int size = leftArr.length + rightArr.length;
        int[] resArr = new int[size];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < size; i++) {
            if (leftIndex == leftArr.length) {
                resArr[i] = rightArr[rightIndex++];
            } else if (rightIndex == rightArr.length) {
                resArr[i] = leftArr[leftIndex++];
            } else if (leftArr[leftIndex] < rightArr[rightIndex]) {
                resArr[i] = leftArr[leftIndex++];
            } else {
                resArr[i] = rightArr[rightIndex++];
            }
        }

        return resArr;

    }
}
