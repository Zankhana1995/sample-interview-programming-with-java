package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String input = "Java microservices are powerful";
        longestWord(input);
    }

    private static void longestWord(String input) {
        String[] str = input.split("\\s+");
        String longest = "";
        int length = 0;

        for (String s : str) {
            if (s.length() > longest.length()) {
                longest = s;
                length = s.length();
            }
        }
        System.out.println("Longest Word ==> " + longest + " with length ==> " + length);
    }
}
