package ru.maslov;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        new GenerateParenthesis().generateParenthesis(2);
    }

    public List<String> generateParenthesis(int n) {

        ArrayList<String> list = new ArrayList<>();
        execute(list, "", 0, 0, n);
        return list;

    }

    public void execute(List<String> list, String str, int ln, int rn, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (ln < max) {
            execute(list, str + "(", ln + 1, rn, max);
        }
        if (rn < ln) {
            execute(list, str + ")", ln, rn + 1, max);
        }

    }


}
