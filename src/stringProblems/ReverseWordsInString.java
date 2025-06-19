package stringProblems;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        /**
         * Input: str = "i.like.this.program.very.much"
         * Output: str = "much.very.program.this.like.i"
         * Explanation:The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".
         *
         * Input: str = ”..geeks..for.geeks.”
         * Output: str = “geeks.for.geeks”
         *
         * Input: str = "...home......"
         * Output: str = "home"
         */

        String str = "i.like.this.program.very.much";
        String[] words = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i>=0; i--) {
            sb.append(words[i]);
            sb.append(".");
        }
        System.out.println(sb);
    }
}
