package arrayProblems;

import java.util.Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] array = {9,8,3,4,5,6,7,2,1};
    //    int n = thirdLargest(array);
        int result = thirdLargestUsingArray(array);
        System.out.println(result);
    }

    private static int thirdLargestUsingArray(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i=0; i< array.length ; i++) {
            if (array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            }
            else if (array[i] > second) {
                third = second;
                second = array[i];
            }
            else if (array[i] > third){
                third = array[i];
            }
        }
        return third;
    }

    private static int thirdLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 3];
    }


}
