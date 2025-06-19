package arrayProblems;

import java.util.*;

public class RemoveGivenElement {
    public static void main(String[] args) {
        /**
         Example 1:

         Input: nums = [3,2,2,3], val = 3
         Output: 2, nums = [2,2,_,_]
         Explanation: Your function should return k = 2, with the first two elements of nums being 2.
         It does not matter what you leave beyond the returned k (hence they are underscores).
         Example 2:

         Input: nums = [0,1,2,2,3,0,4,2], val = 2
         Output: 5, nums = [0,1,4,0,3,_,_,_]
         Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
         Note that the five elements can be returned in any order.
         It does not matter what you leave beyond the returned k (hence they are underscores).
         */

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println(res);

    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count ++;
            }
        }
        // It doesn't matter about remaining element after those 5, it could be anything left behind
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
