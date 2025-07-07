package stringProblems;

import java.util.*;

public class AnagramString {
    public static void main(String[] args) {
        /**
         * Input: s1 = “allergy”  s2 = “allergic”
         * Output: false
         * Explanation: Characters in both the strings are not same. s1 has extra character 'y' and s2 has extra characters 'i' and 'c', so they are not anagrams.
         *
         * Input: s1 = "g", s2 = "g"
         * Output: true
         *
         * Input: s1 ="listen", s2="silent"
         * Output : true
         */

        String s1 = "listen";
        String s2 = "silent";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
        } else {
            System.out.println("Not Anagram");
        }

        boolean result = useCollection(s1,s2);

        /**
         Let n be the length of s1, and assume s2 is of the same length for comparison (say n).

         1. s1.toCharArray() and s2.toCharArray()
         Time complexity: O(n) each → 2 × O(n) = O(n) total

         Reason: Converting string to a character array is a linear operation.

         2. Arrays.sort(c1) and Arrays.sort(c2)
         Time complexity: O(n log n) each → 2 × O(n log n) = O(n log n) total

         Reason: Java uses Dual-Pivot QuickSort for primitives (like char[]), which is O(n log n) on average.

         3. Arrays.equals(c1, c2)
         Time complexity: O(n)

         Reason: Element-by-element comparison of two arrays.
         Total : O(n) + O(n log n) + O(n) = O(n log n)
         */

        System.out.println("With Collection " + result);
    }

    private static boolean useCollection(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        List<Character> list1 = convertToList(s1);
        List<Character> list2 = convertToList(s2);
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);

    }

    private static List<Character> convertToList(String s1) {
        List<Character> list1 = new ArrayList<>();
        for (Character c : s1.toCharArray()) {
            list1.add(c);
        }
        return list1;
    }

    /**
     Let n = s1.length() (since s1 and s2 must be same length)
     Operation	Time Complexity
     convertToList(s1)	O(n)
     convertToList(s2)	O(n)
     Collections.sort(list1)	O(n log n)
     Collections.sort(list2)	O(n log n)
     list1.equals(list2)	O(n)

     Total Time Complexity:
     O(n) + O(n log n) + O(n) = O(n log n)
     */

}
