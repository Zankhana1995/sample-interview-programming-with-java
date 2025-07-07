package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideEvenOddArray {
    public static void main(String[] args) {
        /**
         * array -> 1,2,3,4,5,6,7,8,9,10
         * odd -> 1,3,5,7,9
         * even -> 2,4,6,8,10
         */

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i =0 ; i < array.length - 1 ; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }
        int[] oddArray = odd.stream().mapToInt(Integer :: intValue).toArray();
        int[] evenArray = even.stream().mapToInt(Integer :: intValue).toArray();

        System.out.println(Arrays.toString(oddArray));
        System.out.println(Arrays.toString(evenArray));

    }
}
