package ru.maslov;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcaassdfsdfbcbb");
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> list = new HashSet<>();

        int result = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            Character c = s.charAt(end);
            if (!list.contains(c)) {
                list.add(c);
                end++;
                result = Math.max(result, end - start);
            } else {
                list.remove(s.charAt(start));
                start++;
            }
        }
        return result;
    }

}
