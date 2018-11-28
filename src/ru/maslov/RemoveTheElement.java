package ru.maslov;

public class RemoveTheElement {
    public static void main(String[] args) {
        removeElement(new int[]{1, 3, 3, 3, 1, 2, 3}, 3);
    }

    static public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[a] = nums[i];
            a++;
        }

        return a;
    }
}
