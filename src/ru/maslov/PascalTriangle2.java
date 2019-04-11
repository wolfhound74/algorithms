package ru.maslov;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        new PascalTriangle2().getRow(3);
    }

    private List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int row = 0; row <= rowIndex; row++) {
            list.add(0, 1);

            for (int pos = 1; pos < row; pos++) {
                list.set(pos, list.get(pos) + list.get(pos + 1));
            }
        }

        return list;
    }
}
