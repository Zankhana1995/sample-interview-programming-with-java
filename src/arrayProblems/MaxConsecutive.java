package arrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxConsecutive {
    public static void main(String[] args) {
        /**
         * Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
         * Output: 4
         * Explanation: The maximum number of consecutive 1's in the array is 4 from index 8-11.
         *
         * Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
         * Output: 2
         * Explanation: The maximum number of consecutive 0's in the array is 2 from index 0-1.
         *
         * Input: arr[] = {0, 0, 0, 0}
         * Output: 4
         * Explanation: The maximum number of consecutive 0's in the array is 4.
         */
        int[] arr = {0, 0, 0, 0};
        int count = countConsecutive(arr);
        int res = usingList(arr);
        System.out.println(count);
    }

    // 1st way
    private static int countConsecutive(int[] arr) {
       int count = 1;
       int result = 1;
       for (int i=1; i< arr.length ; i++) {
           if (arr[i-1] == arr[i]) {
               count ++;
           } else {
               count = 1;
           }
           result = Math.max(count, result);
       }
       return result;
    }

    // 2nd way
    private static int usingList(int[] arr) {
        int count = 1;
        List<Integer> countList = new ArrayList<>();
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            }
            else {
                countList.add(count);
                count = 1;
            }
        }
        // for last sequence
        countList.add(count);
        return Collections.max(countList);
    }
}
