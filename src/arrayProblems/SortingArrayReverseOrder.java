package arrayProblems;

import java.util.Arrays;

public class SortingArrayReverseOrder {
    public static void main(String[] args) {
        int[] array = {4,6,12,14,10,25};

        for(int i=0; i< array.length-1; i++) {
           for (int j=0; j<array.length-1-i;j++) {
               if(array[j] < array[j+1]) {
                   int temp = array[j+1];
                   array[j+1] = array[j];
                   array[j] = temp;
               }
           }
        }
        System.out.println(Arrays.toString(array));
    }
}

/*
-> i=0
4,6,12,14,10,25 (starting position)
6,4,12,14,10,25
6,12,4,14,10,25
6,12,14,4,10,25
6,12,14,10,4,25
6,12,14,10,25,4

-> i=1 (last element is fixed), j = array.length - 1 - i (here minus 1 is because in the swap we will do +1)
6,12,14,10,25,4
12,6,14,10,25,4
12,14,6,10,25,4
12,14,10,6,25,4
12,14,10,25,6,4

-> i=2 (last 2 elements are fixed),
12,14,10,25,6,4
14,12,10,25,6,4
14,12,25,10,6,4

-> i=3 (last 3 elements are fixed)
14,12,25,10,6,4
14,25,12,10,6,4

->i=4 (last 4 elements are fixed)
14,25,12,10,6,4
25,14,12,10,6,4


 */