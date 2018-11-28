package ru.maslov.arrays;

public class NextPermutations {
    public static void main(String[] args) {
        int[] r = {1, 2, 3};
        new NextPermutations().nextPermutation(r);
    }

    public void nextPermutation(int[] nums) {

        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] > nums[i]) {
            i--;
        }


    }
}
