package arrayProblems;

public class FirstUniqueElement {
    public static void main(String[] args) {
        // mastercard round 2
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
    }

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
}

// ----------------- Another way -----------------//



