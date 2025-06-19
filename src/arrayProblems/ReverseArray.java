package arrayProblems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Input : {1,2,3,4,5,6}
        // Output : {6,5,4,3,2,1}

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] result = new int[arr.length];
        int count =0;
        for (int i=arr.length -1 ; i>=0; i--) {

            result[i] = arr[count];
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
