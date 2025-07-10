package arrayProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueElement {
    public static void main(String[] args) {
        // mastercard round 2
        // Result the first Element which doesn't repeat in the array
        /**
         arr = {1, 4, 5, 1, 2, 0, 4, 5};
         res = 2

         arr = {5,1,2,3,5,4}
         res = 1
         */

        int[] arr = {1, 4, 5, 1, 2, 0, 4, 5};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] &&  i != j ) {
                    count++;
                    break; // no need to go further, as element is more than one
                }
            }
            if (count == 1) {
                res = arr[i];
                break; //break and return the first element you find with result as count = 1 (Unique)
            }
        }
        System.out.println(res);
        anotherWay(arr);
        usingCollections(arr);
    }

    // O(n^2) complexity
    private static void anotherWay(int[] arr) {
        int result = 0;
        for (int i =0 ; i< arr.length ; i++) {
            for (int j =0 ; j < arr.length ; j++) {
                if ( i!=j) {
                    if (arr[i] == arr[j]) {
                        result = 0;
                        break;
                    } else if (arr[i] != arr[j]) {
                        result = arr[i];
                    }
                }
            }
            if (result != 0) {
                System.out.println(result);
                break;
            }
        }
    }

    // ----------------- Another way : Using Collection : O(n) complexity -----------------//
    private static void usingCollections(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        //  {1, 4, 5, 1, 2, 0, 4, 5};
        for(int n : arr) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }
        int result = 0 ;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        System.out.println("Using collection result => " + result);
    }
}


