package arrayProblems;

import java.util.Arrays;

// EPAM test

public class PlusOneArray {
    public static void main(String[] args) {
        int[] digits = {9,  9, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the end of the array
        for (int i= n-1 ; i >= 0 ; i--) {

            // If current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            // If it's 9, set to 0 and continue to next digit
            digits[i] = 0;
        }

        // If all digits were 9, result will be a new array with one extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 + 1 = 1000
        return result;

    }
}

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the i-th digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * The result should be [1,2,4].
 * 0 <= digits[i] <=9
 * 0< digits.len <= 100
 */