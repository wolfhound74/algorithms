package ru.maslov.sort;

abstract class CommonAlgorithm implements IAlgorithm {
    private int[] arr;

    int[] getArr() {
        return arr;
    }

    CommonAlgorithm(int[] arr) {
        this.arr = arr.clone();
    }
}
