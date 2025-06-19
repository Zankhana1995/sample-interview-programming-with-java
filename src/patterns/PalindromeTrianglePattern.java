package patterns;

public class PalindromeTrianglePattern {
    /**
     *
     *           1
     *         2 1 2
     *       3 2 1 2 3
     *     4 3 2 1 2 3 4
     *   5 4 3 2 1 2 3 4 5
     * 6 5 4 3 2 1 2 3 4 5 6
     */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // inner loop to print the first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
