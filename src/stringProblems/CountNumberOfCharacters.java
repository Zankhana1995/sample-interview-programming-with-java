package stringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {
    public static void main(String[] args) {
        String input = "Zankhana Patel";
        countChars(input);
    }

    private static void countChars(String input) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : input.replace(" ", "").toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        System.out.println(result);
        // Check the code of MostFrequentCharacterInString to find out most occurred character.
    }
}
