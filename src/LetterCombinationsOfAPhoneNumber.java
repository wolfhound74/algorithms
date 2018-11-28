import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    Map<Character, List<Character>> phone = new HashMap<>();


    public static void main(String[] args) {
        new LetterCombinationsOfAPhoneNumber().letterCombinations("239");

    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits == null || digits.isEmpty()) return result;

        String[] buttons = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        result.add("");
        while (result.peek().length() != digits.length()) {
            String head = result.remove(); //достаем из очереди первый эдемент
            int digit = Character.getNumericValue(digits.charAt(head.length()));

            String letters = buttons[digit];
            for (char letter : letters.toCharArray()) {
                result.addLast(head + letter);
            }
        }
        return result;
    }
}
