package ru.maslov;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 7, 8, 10}, 8);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        if (result[0] == -1) {
            return result;
        }

        for (int i = nums.length; i >= 0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        return result;
    }

//    public int[] searchRange(int[] nums, int target) {
//        int[] targetRange = {-1, -1};
//
//        int leftIdx = extremeInsertionIndex(nums, target, true);
//
//        if (leftIdx == nums.length || nums[leftIdx] != target) {
//            return targetRange;
//        }
//
//        targetRange[0] = leftIdx;
//        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1;
//
//        return targetRange;
//    }

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
