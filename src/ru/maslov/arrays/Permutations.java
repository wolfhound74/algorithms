package ru.maslov.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] r = {1, 2, 3};
        new Permutations().permute(r);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, new ArrayList<>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        int s = permutation.size();

        if (s == nums.length) {
            permutations.add(permutation);
            return;
        }

        int el = nums[s];

        for (int position = 0; position <= s; position++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(position, el);
            collectPermutations(nums, newPermutation, permutations);
        }
    }
}
