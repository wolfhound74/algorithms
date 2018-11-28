package ru.maslov;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 2, 1};
        new MoveZeros().moveZeroes(arr);
    }

    public void moveZeroes(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[position] == 0) {
                nums[position] = nums[i];
                nums[i] = 0;
            }
            position++;

        }
    }
}
