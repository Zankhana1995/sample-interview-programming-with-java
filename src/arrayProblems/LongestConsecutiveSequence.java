package arrayProblems;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        /**

         Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
         Output: 6
         Explanation: The consecutive numbers here are from 1 to 6. These 6 numbers form the longest consecutive subsequence [2, 6, 1, 4, 5, 3].

         Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
         Output: 4
         Explanation: The subsequence [1, 3, 4, 2] is the longest subsequence of consecutive elements

         Input: arr[] = [36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42]
         Output: 5
         Explanation: The subsequence [36, 35, 33, 34, 32] is the longest subsequence of consecutive elements.

         */
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        Arrays.sort(arr);

        int count = 1;
        int res = 1;
        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] == arr[i-1]) { // We need to ignore same element (duplicate)
                continue;
            }
            if (arr[i] == arr[i-1] +1) {
                count ++;
            } else {
               count =1 ;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
        // time complexity : O(n logn), space complexity = O(1)
    }


}
