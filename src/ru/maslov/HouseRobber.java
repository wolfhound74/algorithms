package ru.maslov;

public class HouseRobber {
    public static void main(String[] args) {
        new HouseRobber().rob(new int[]{2, 7, 1, 6, 9, 3, 1});
//        new HouseRobber().rob(new int[]{1, 3, 2, 1});
    }

    public int rob(int[] nums) {
        int bestSum = 0;
        int secondSum = 0;

        for (int num : nums) {
            int tmp = bestSum;
            bestSum = Math.max(secondSum + num, bestSum);
            secondSum = tmp;
        }

        return bestSum;
    }
}
