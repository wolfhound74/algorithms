package ru.maslov.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        new GroupAnagrams().groupAnagrams(words);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();

        HashMap<String, List> hashMap = new HashMap<>();

        for (String word : strs) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);

            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(word);
            } else {
                ArrayList<String> newGroup = new ArrayList();
                newGroup.add(word);
                hashMap.put(key, newGroup);
            }

        }


        return new ArrayList(hashMap.values());
    }

}
