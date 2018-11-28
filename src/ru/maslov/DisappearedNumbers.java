package ru.maslov;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        new DisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
//        new DisappearedNumbers().findDisappearedNumbers(new int[]{1, 1});
//        new DisappearedNumbers().findDisappearedNumbers(new int[]{1, 4, 8});
//        new DisappearedNumbers().findDisappearedNumbers(new int[]{4, 8});
//        new DisappearedNumbers().findDisappearedNumbers(new int[]{1, 1});

    }

    //    public List<Integer> findDisappearedNumbers(int[] nums) {
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            int minIndex = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] < nums[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            if (nums[minIndex] < nums[i]) {
//                nums[i] += nums[minIndex] - (nums[minIndex] = nums[i]);
//            }
//        }
//
//        int lastVal = Integer.MIN_VALUE;
//        int index = 1;
//        for (int j = nums[0]; j < nums[nums.length - 1]; j++) {
//
//        }
//
//        return result;
//    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }

        return ret;
    }

}


//    int index = 0;
//    int val = nums[index++];
//        while (val < nums[nums.length - 1]) {
//        if (val == nums[index]) {
//
//        }
//        }
//
//        for (int i = 0; i < nums[nums.length - 1] - nums[0]; i++) {
//        int a = nums[i];
//
//
//        }