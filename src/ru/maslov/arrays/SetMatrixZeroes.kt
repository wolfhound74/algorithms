package ru.maslov.arrays

import java.util.*
/*
* time complexity O(M * N)
*
*
*
* Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
* https://leetcode.com/problems/set-matrix-zeroes/
* */

fun main(args: Array<String>) {
    val matrix2 = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5))
    setZeroes(matrix2)
}

fun setZeroes(matrix: Array<IntArray>): Unit {
    val iList = HashSet<Int>()
    val jList = HashSet<Int>()

    for (i in matrix.indices) {
        for (j in 0 until matrix[i].size) {
            val el = matrix[i][j]
            if (el == 0) {
                iList.add(i)
                jList.add(j)
            }
        }
    }

    for (i in matrix.indices) {
        val set0 = iList.contains(i)
        for (j in 0 until matrix[i].size) {
            if (set0 || jList.contains(j)) {
                matrix[i][j] = 0
            }
        }
    }
}