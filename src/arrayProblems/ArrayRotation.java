package arrayProblems;

public class ArrayRotation {
    public static void main(String[] args) {
        /**
         *
         * Let us take arr[] = {1, 2, 3, 4, 5, 6}, d = 2.
         *
         * First Step:
         *         => Rotate to left by one position.
         *         => arr[] = {2, 3, 4, 5, 6, 1}
         * Second Step:
         *         => Rotate again to left by one position
         *         => arr[] = {3, 4, 5, 6, 1, 2}
         * Rotation is done 2 times.
         * So the array becomes arr[] = {3, 4, 5, 6, 1, 2}
         *
         */

        int[] arr = {1, 2, 3, 4, 5, 6};
        // output : 3 4 5 6 1 2
        int d = 2;
        int[] arr2 = rotateArr(arr, d);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static int[] rotateArr(int[] arr, int d) {
        while (d > 0) {
            int left = arr[0];
            for (int i = 1; i < arr.length ; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length -1] = left;
            d-- ;
        }
        return arr;
    }
}
