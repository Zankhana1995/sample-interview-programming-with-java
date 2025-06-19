package arrayProblems;

import java.util.Arrays;

public class MultiplyRemainingIndexElements {
    public static void main(String[] args) {

        //Input : {1,2,3,4}
        // Output : {24,12,8,6}
        // On each index, multiply remaining index element and save in result array
        // e.g. on index 0, index 1,2,3 elements will be multiplied and saved at index 0
        int[] array = { 1, 2, 3, 4};
        int[] result = new int[array.length];
        for (int i=0;i<array.length;i++) {
            int answer = 1;
            for (int j=0;j<array.length;j++) {
                if(i!=j) {
                    answer *= array[j];
                }
            }
            result[i] = answer;
        }
        System.out.println(Arrays.toString(result));

    }
}
