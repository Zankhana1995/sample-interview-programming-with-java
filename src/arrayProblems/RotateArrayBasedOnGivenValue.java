package arrayProblems;

public class RotateArrayBasedOnGivenValue {
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
        int[] arr2 = arr.clone();
        while (d > 0) {
            int temp = arr2[0];
            for (int i = 0; i < arr.length -1; i++) {
                arr2[i] = arr2[i+1];
            }
            arr2[arr2.length-1] = temp;
            d--;
        }
        return arr2;
    }
}
