package arrayAndCollectionsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        // Citi bank round 2: with Hexaware
        /**
         * Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
         * Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
         * Explanation: There are three 0s that are moved to the end.
         *
         * Input: arr[] = [10, 20, 30]
         * Output: arr[] = [10, 20, 30]
         * Explanation: No change in array as there are no 0s.
         *
         * Input: arr[] = [0, 0]
         * Output: arr[] = [0, 0]
         * Explanation: No change in array as there are all 0s.
         */
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] result = moveAllZerosToEnd(arr);
        System.out.print("With Collection " + Arrays.toString(result));
        int[] result2  = moveAllZerosToEndWithoutCollection(arr);
        System.out.println("Without Collection " + Arrays.toString(result2));

    }

    // Idea : put all non-zero elements to temp array, and for all remaining spaces assign 0 at the end,
    // Keep track of count on how many non-zero elements were appended
    private static int[] moveAllZerosToEndWithoutCollection(int[] arr) {
        int[] tempArray = new int[arr.length];
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                tempArray[count] = arr[i];
                count++;
            }
        }
        // There is no need of below for loop to insert 0 for remaining spaces because default value of int array is 0.
//        for (int i =count;i < arr.length - count ; i++) {
//            arr[count] = 0;
//        }
        return tempArray;
    }

    private static int[] moveAllZerosToEnd(int[] arr) {
        int[] result = new int[arr.length];
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                listTwo.add(arr[i]);
            } else {
                listOne.add(arr[i]);
            }
        }
        listOne.addAll(listTwo);
        for (int i = 0; i < listOne.size(); i++) {
            result[i] = listOne.get(i);
        }
        return result;
    }
}
