package patterns;

public class DiamondStarPattern {
    /**
     *      *
     *     ***
     *    *****
     *   *******
     *  *********
     * ***********
     *  *********
     *   *******
     *    *****
     *     ***
     *      *
     */
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {

            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {

            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
