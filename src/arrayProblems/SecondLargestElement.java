package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }
      //  int result = findSecondLargest(arr);
        int sortingResult = findSortingSecondLargest(arr);
    //    System.out.println(result);
        System.out.println(sortingResult);
    }

    private static int findSortingSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    private static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }
}
