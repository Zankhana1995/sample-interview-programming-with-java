package arrayProblems;

import java.util.Arrays;

public class MaxMultiplyArray {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 6, 20, -40, -20, -1};

        int res = maxProduct(arr);

        System.out.println(res);

    }

    /*
    Sort the array using some efficient in-place sorting algorithm in ascending order.
In triplets, either there will be 2 negative elements and 1 positive element or all 3 positive elements so that resultant product will be positive.
Therefore, To maximise the result return the maximum of  product of the last three elements of the array and the product of the first two elements and last element.
     */
    private static int maxProduct(int[] arr) {
        Arrays.sort(arr);
        // -40, -20, -1, 3,5,6,10,20
        return Math.max(arr[0] * arr[1] * arr[arr.length -1], arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]);

    }
}
