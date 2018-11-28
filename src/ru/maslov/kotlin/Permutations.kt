package ru.maslov.kotlin

import java.util.*

fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1, 2, 3)

    permute(x)
}

fun permute(nums: IntArray): List<List<Int>> {
    val permutations = ArrayList<ArrayList<Int>>()
    if (nums.size == 0) {
        return permutations
    }

    collectPermutations(nums, ArrayList<Int>(), permutations)
    return permutations
}

fun collectPermutations(nums: IntArray, permutation: ArrayList<Int>, permutations: ArrayList<ArrayList<Int>>) {
    val ps = permutation.size

    if (ps == nums.size) {
        permutations.add(permutation)
        return
    }
    val el = nums.get(ps)

    for (position in 0..ps) {
        val _permutation = ArrayList<Int>(permutation)
        _permutation.add(position, el)
        collectPermutations(nums, _permutation, permutations)
    }
}