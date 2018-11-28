package ru.maslov;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
//        new StringToIntegerAtoi().myAtoi("42");
//        new StringToIntegerAtoi().myAtoi("words and 987");
        new StringToIntegerAtoi().myAtoi("-91283472332");

//        Integer.parseInt("4444");
//        Character.digit("4444".charAt(0), 10);
    }

    public int myAtoi(String str) {
        int res = 0;

        str = str.trim();

        boolean negative = false;
        int i = 0;
        boolean limit = false;

        if (str.startsWith("-")) {
            negative = true;
            i++;
        } else if (str.startsWith("+")) {
            i++;
        }

        while (i < str.length()) {
            int r = Character.digit(str.charAt(i++), 10);

            if (r < 0) {
                break;
            }

            int tmp = res * 10 + r;
            if (tmp < res) {
                limit = true;
                break;
            } else {
                res = tmp;
            }
        }

        return limit ? (negative ? Integer.MIN_VALUE : Integer.MAX_VALUE) : (negative ? -res : res);
    }
}
