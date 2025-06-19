package patterns;

public class NumberIncreasingReversePyramid {
    /**
     * 1 2 3 4 5 6
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public static void main(String[] args) {
        int n = 6;

        for (int i = 6; i >=1; i--) {
            int count = 1;
            for (int j = i; j >=1; j--) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
