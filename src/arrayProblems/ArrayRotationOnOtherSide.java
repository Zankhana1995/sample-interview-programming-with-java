package arrayProblems;

import java.util.Arrays;

public class ArrayRotationOnOtherSide {
    public static void main(String[] args) {
        /**
         *   int[] nums = {1, 100, 3, 99, 15};
         *   k =2
         *   result = {99,15,1,100,3}
         */
        int[] nums = {1, 100, 3, 99,15};
        int k = 3;

        while (k > 0) {
            int temp = nums[0];
            for (int i=1; i < nums.length ;i++) {
                nums[i-1] = nums[i];
            }
            nums[nums.length-1] = temp;
            k--;
        }
        System.out.println(Arrays.toString(nums));

        /** Time complexity : You're rotating an array k times to the left by 1 position each time.

         Outer loop runs k times (k = 3)

         Inner loop (for-shift) runs n-1 times for each rotation (n = nums.length = 5)

         So, total operations = k * (n - 1) → O(k × n)

         In your case:
         O(3 × 5) = 15 operations, but asymptotically:

         Time Complexity: O(k × n)
         Space Complexity: O(1) -> No extra array is used — only a few temp variables.

         */
    }
}
