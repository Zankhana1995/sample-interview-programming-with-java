package stringProblems;

import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        /**
         * Input: s = "geeksforgeeks"
         * Output: 'f'
         * Explanation: 'f' is the first character in the string which does not repeat.
         *
         * Input: s = "racecar"
         * Output: 'e'
         * Explanation: 'e' is the only character in the string which does not repeat.
         *
         * Input: "aabbccc"
         * Output: '$'
         * Explanation: All the characters in the given string are repeating.
         */
        String s = "geeksforgeeks";
        char ch = findNonrepeatingCharacters(s);
        String result2 = findNonrepeatingCharactersCollection(s);
        System.out.println("Result is " +  ch);
        System.out.println("Result 2 is " +  result2);

    }

    private static String findNonrepeatingCharactersCollection(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c) + 1);
            }
        }
        String result = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
                break;
            }
        }
        return result;
    }

    private static char findNonrepeatingCharacters(String s) {
        /**
         * The idea is to use two nested loops, the outer loop for picking an element and the inner loop for finding another
         * occurrence of the picked character in the string. As soon as we find a character which has only one occurrence in the input string,
         * return it. If all characters have multiple occurrences, return '$'.
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (i!=j && s.charAt(i) == s.charAt(j)) {
                    count ++;
                    break;
                }
            }
            if (count == 0)
                sb.append(s.charAt(i));
        }
        return sb.toString().charAt(0);
    }
}
