package patterns;

public class NumberTriangle {
    /**
     *
     *      1
     *     2 2
     *    3 3 3
     *   4 4 4 4
     *  5 5 5 5 5
     * 6 6 6 6 6 6
     */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
