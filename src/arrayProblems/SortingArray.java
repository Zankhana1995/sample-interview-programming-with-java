package arrayProblems;

import java.util.Arrays;

public class SortingArray {
    // RBC Client interview via Tech Mahindra
    public static void main(String[] args) {
        int[] array = {25,12,14,6,4};
        // Without any in-built methods
        // Output : {4,6,12,14,25}

        /* This is bubble sort (use swaping)
        Bubble sort has O(n²) average and worst-case time complexity,
        and O(n) best-case with optimization (when given array is already sorted)
         */

        for (int i=0; i< array.length-1; i++) {
            // The second for loop will not go till end every time, after finishing iteration of every i,
            // the last element will be fixed, so it will swap remaining length - i - 1 elements.
            for (int j=0; j<array.length - i -1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
-> i=0
25,12,14,6,4 (starting position)
12,25,14,6,4
12,14,25,6,4
12,14,6,25,4
12,14,6,4,25

-> i=1 (last element is fixed),  j = array.length - 1 - i (here minus 1 is because in the swap we will do +1)
12,14,6,4,25
12,6,14,4,25
12,6,4,14,25

-> i=2 (last 2 elements are fixed)
12,6,4,14,25
6,12,4,14,25
6,4,12,14,25

-> i=3 (last 3 elements are fixed)
6,4,12,14,25
4,6,12,14,25 <- result

 */