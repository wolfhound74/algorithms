package ru.maslov.recursion;

public class PrintReverse {


    public static void main(String[] args) {
//        printReverse("cowabunga".toCharArray());
        char[] arr = "cowabunga".toCharArray();
        reverseString(arr);
    }

    private static void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }

        exec(s, 0, s.length - 1);
    }

    private static void exec(char[] s, int leftInex, int rightIndex) {
        if (leftInex >= rightIndex) {
            return;
        }

        s[leftInex] = (char) (s[leftInex] + s[rightIndex] - (s[rightIndex] = s[leftInex]));
        exec(s, leftInex + 1, rightIndex - 1);
    }
}
