package stringProblems;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacterInString {
    public static void main(String[] args) {
        String input = "Zankhana Patel";
        countFrequentChar(input);
    }

    private static void countFrequentChar(String input) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : input.replace(" ","").toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        System.out.println(result);

        int max = 0;
        char mostFrequentChar = ' ';
        for(Map.Entry<Character, Integer> entry : result.entrySet()) {
            if(entry.getValue() > max) {
                mostFrequentChar = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println("Most frequent character: " + mostFrequentChar);
        System.out.println("Count: " + max);
    }
}
