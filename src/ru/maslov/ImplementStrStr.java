package ru.maslov;

public class ImplementStrStr {
    public static void main(String[] args) {
        strStr("asdasddd", "dd");
    }

    public static int strStr(String haystack, String needle) {

        int haystackSize = haystack.length();
        for (int i = 0; i <= haystackSize; i++) {
            if (haystack.startsWith(needle)) {
                return i;
            } else if (haystack.length() <= needle.length()) {
                break;
            }

            haystack = haystack.substring(1, haystack.length());
        }
        return -1;
    }
}
