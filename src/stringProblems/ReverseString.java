package stringProblems;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        /**
         * Input: s = "GeeksforGeeks"
         * Output: "skeeGrofskeeG"
         * Explanation : The first character G moves to last position, the second character e moves to second-last and so on.
         */

        String s = "GeeksforGeeks";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);

        System.out.println(reverseBySwaping(s));
    }

    // reverse without creating a new variable, just swapping
    private static String reverseBySwaping(String s) {
        char[] chars = s.toCharArray();
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        int left = 0;
        int right = s.length() -1 ;
        while (left < right) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left ++;
            right --;
        }
        return String.valueOf(chars);
    }
}
