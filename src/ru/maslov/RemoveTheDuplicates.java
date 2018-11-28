package ru.maslov;

public class RemoveTheDuplicates {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }

    static public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[a] == nums[i]) {
                continue;
            }
            nums[++a] = nums[i];
        }

        return nums.length;
    }
}
