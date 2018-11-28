package ru.maslov;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }


    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }

        int low = 0;
        int high = nums.length;
        int midIndex;

        while (low < high) {
            midIndex = (low + high) >>> 1;

            if (target == nums[midIndex]) {
                return midIndex;
            }

            if (target < nums[midIndex]) {
                high = midIndex;
            } else {
                low = midIndex + 1;
            }
        }

        return low;
    }
}
