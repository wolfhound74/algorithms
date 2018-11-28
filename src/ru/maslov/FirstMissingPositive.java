package ru.maslov;

import java.util.PriorityQueue;

public class FirstMissingPositive {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 0};
        int[] arr = {0, 2, 2, 1, 1};
        new FirstMissingPositive().firstMissingPositive(arr);
    }

    public int firstMissingPositive(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int num : nums) {
            if (queue.contains(num)) {
                continue;
            }
            queue.add(num);
        }
        int res = 1;

        while (!queue.isEmpty()) {
            int el = queue.poll();

            if (el <= 0) {
                continue;
            }

            if (el != res) {
                break;
            }

            res++;
        }

        return res;
    }
}
