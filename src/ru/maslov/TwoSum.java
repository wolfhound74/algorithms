package ru.maslov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        twoSum(new int[]{2, 5, 9, 14}, 14)
                )
        );
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int el = target - arr[i];

            if (map.containsKey(el)) {
                return new int[]{map.get(el), i};
            }

            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
