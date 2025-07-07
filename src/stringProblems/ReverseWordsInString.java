package stringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String[] arr = str.split("\\.");
        List<String> list = new ArrayList<>();
        for (int i=arr.length -1 ; i>=0; i--) {
            if(!arr[i].isEmpty()) {
                list.add(arr[i]);
            }
        }
        String res = String.join(".", list);
        System.out.println(res);
    }
}
