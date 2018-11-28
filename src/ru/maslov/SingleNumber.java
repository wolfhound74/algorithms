package ru.maslov;

public class SingleNumber {
    public static void main(String[] args) {

        new SingleNumber().singleNumber(new int[]{2, 2, 1, 2});
    }

    public int singleNumber(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++)
            res ^= nums[i];

        return res;
    }
}
