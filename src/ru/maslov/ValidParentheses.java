package ru.maslov;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        isValid("(");
    }

    static boolean isValid(String s) {
        Map map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        char[] arr = s.toCharArray();

        try {
            for (int i = 0; i < arr.length; i++) {
                Character c = arr[i];

                if (map.containsKey(c)) {
                    stack.push(c);
                    continue;
                }
                if (map.containsValue(c) && map.get(stack.pop()) != c) {
                    return false;
                }

            }

        } catch (EmptyStackException e) {
            return false;
        }

        return stack.empty();
    }
}
