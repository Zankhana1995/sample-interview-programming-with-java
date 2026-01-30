package random;

import java.util.Scanner;

public class NthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] series = {2, 4, 8};
        int result = findNthTerm(n, series);
        System.out.println(result);
    }

    private static int findNthTerm(int n, int[] series) {
        int nThTerm = (n-1)%3;
        return series[nThTerm];
    }
}
