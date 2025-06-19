package arrayProblems;

import java.util.Arrays;

public class DivideEvenOddArray {
    public static void main(String[] args) {
        /**
         * array -> 1,2,3,4,5,6,7,8,9,10
         * odd -> 1,3,5,7,9
         * even -> 2,4,6,8,10
         */
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] oddArray = new int[array.length];
        int[] evenArray = new int[array.length];

        for (int i=0;i<array.length;i++) {
            if(array[i] % 2 == 0) {
                evenArray[i] = array[i];
            } else {
                oddArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(evenArray));

    }
}
