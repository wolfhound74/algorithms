package ru.maslov;

import java.util.HashMap;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        System.out.println(
                new LongestPalindromicSubstring().longestPalindrome(null)
        );
    }

    public String longestPalindrome(String s) {
        if (s == null || s.equals("")) return "";

        Integer start = 0;
        Integer end = 0;
        Integer maxLength = 0;

        for (int index = 0; index < s.length(); index++) {
            HashMap<String, Integer> firstVar = getData(s, index, index);
            HashMap<String, Integer> secondVarVar = getData(s, index, index + 1);

            if (firstVar.get("length") >= maxLength) {
                maxLength = firstVar.get("length");
                start = firstVar.get("leftIndex");
                end = firstVar.get("rightIndex");
            }
            if (secondVarVar.get("length") >= maxLength) {
                maxLength = secondVarVar.get("length");
                start = secondVarVar.get("leftIndex");
                end = secondVarVar.get("rightIndex");
            }
        }

        return s.substring(start, end + 1);
    }


    private HashMap<String, Integer> getData(String str, Integer leftIndex, Integer rightIndex) {
        HashMap<String, Integer> data = new HashMap<>();
        data.put("leftIndex", 0);
        data.put("rightIndex", 0);
        data.put("length", 0);

        while (leftIndex >= 0 && rightIndex < str.length() && str.charAt(leftIndex) == str.charAt(rightIndex)) {
            data.put("leftIndex", leftIndex);
            data.put("rightIndex", rightIndex);
            data.put("length", rightIndex - leftIndex);

            leftIndex--;
            rightIndex++;
        }

        return data;
    }
}
