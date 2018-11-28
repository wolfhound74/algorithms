package ru.maslov;

public class PlusOne {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        int[] nums = {1, 2, 9};
        int[] nums = {9, 9};
        new PlusOne().plusOne(nums);
    }

    public int[] plusOne(int[] digits) {

        int val = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int v = digits[i];
            if (v == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i] = v + 1;
            val = 0;
            break;
        }
        if (val > 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = val;

            for (int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            digits = arr;
        }
        return digits;
    }
}
