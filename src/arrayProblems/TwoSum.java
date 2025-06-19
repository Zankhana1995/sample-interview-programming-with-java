package arrayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     Example 1:
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

     Example 2:
     Input: nums = [3,2,4], target = 6
     Output: [1,2]

     Example 3:
     Input: nums = [3,3], target = 6
     Output: [0,1]
     */

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new int[2];

//        for (int i=0;i<nums.length ; i++) {
//            for (int j = i+1; j<nums.length;j++) {
//                if(nums[i]+nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    break;
//                }
//            }
//        }
        result = twoSumEfficientWay(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSumEfficientWay(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length ; i++) {
            int current = nums [i];
            int temp = target - current;
            if(map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(current, i);
        }
        return null;
    }
}
