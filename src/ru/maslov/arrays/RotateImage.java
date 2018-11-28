package ru.maslov.arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        new RotateImage().rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                matrix[i][j] += matrix[j][i] - (matrix[j][i] = matrix[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                matrix[i][j] += matrix[i][matrix.length - 1 - j] - (matrix[i][matrix.length - 1 - j] = matrix[i][j]);
            }
        }
    }

}
