package patterns;

import java.util.Scanner;

public class NumberChangingPyramid {
    /**
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     * 16 17 18 19 20 21
     */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j<= i ; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }
}
