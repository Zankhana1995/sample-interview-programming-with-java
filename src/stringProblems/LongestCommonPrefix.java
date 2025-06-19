package stringProblems;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        /**
         * Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
         * Output: “gee”
         * Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.
         *
         * Input: arr[] = [“apple”, “ape”, “april”]
         * Output : “ap”
         * Explanation: “ap” is the longest common prefix in all the given strings: “apple”, “ape” and “april”.
         *
         * Input: arr[] = [“hello”, “world”]
         * Output: “”
         * Explanation: There’s no common prefix in the given strings.
         *
         * Approach : The idea is to sort the array of strings and find the common prefix of the first and last string of the sorted array.
         * Sorting is used in this approach because it makes it easier to find the longest common prefix.
         * When we sort the strings, the first and last strings in the sorted list will be the most different from each other in terms of their characters.
         * So, the longest common prefix for all the strings must be a prefix of both the first and the last strings in the sorted list.
         */

        /**
         * Illustration:
         *
         * Given array of strings is [“geeksforgeeks”, “geeks”, “geek”, “geezer”].
         * After sorting it becomes [“geek” ,”geeks” ,”geeksforgeeks” ,”geezer”].
         * Now, to find the longest common prefix, we only need to compare the first and last strings (“geek” and “geezer“) because any common prefix between these two will also be a prefix for all the strings in between.
         * In this case, the common prefix between “geek” and “geezer” is “gee“, which is the longest common prefix for all the strings.
         */

        String[] arr = {"apple", "ape", "april"};
        String str = longestCommonPrefix(arr);
        System.out.println(str);

    }

    private static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        if (Objects.equals(first, last)) return first;
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i)==last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
