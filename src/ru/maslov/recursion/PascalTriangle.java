package ru.maslov.recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        new PascalTriangle().generate(5);
    }

    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);
        if (numRows == 0) {
            return triangle;
        }
        triangle.addAll(generate(numRows - 1));

        ArrayList<Integer> row = new ArrayList<>(numRows);
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            if (rowIndex == 0 || rowIndex == numRows - 1) {
                row.add(rowIndex, 1);
            } else {
                List<Integer> prevRow = triangle.get(numRows - 2);
                //f(i,j)=f(i−1,j−1)+f(i−1,j)
                int res = prevRow.get(rowIndex - 1) + prevRow.get(rowIndex);
                row.add(rowIndex, res);
            }
        }

        triangle.add(row);
        return triangle;
    }


}
