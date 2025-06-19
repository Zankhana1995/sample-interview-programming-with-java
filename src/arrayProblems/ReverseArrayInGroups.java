package arrayProblems;

import java.util.Arrays;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        /**
         Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3
         rotate element in the pair of 3
         Output: 3, 2, 1, 6, 5, 4, 9, 8, 7

         Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 5
         Output: 5, 4, 3, 2, 1, 8, 7, 6

         Input: arr[] = [1, 2, 3, 4, 5, 6], k = 1
         Output: 1, 2, 3, 4, 5, 6

         Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 10
         Output: 8, 7, 6, 5, 4, 3, 2, 1

         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
        int k = 3;
        int[] result = reverseArrayInGroup(arr,k);

        System.out.print(Arrays.toString(result));

    }

    private static int[] reverseArrayInGroup(int[] arr,int k) {
        for (int i = 0; i < arr.length ; i+=k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length -1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
        }
        return arr;

        /**
         Time: O(n) — Still linear
         Space: O(n/k) recursion stack calls (or O(n) worst-case)
         */
    }
}
