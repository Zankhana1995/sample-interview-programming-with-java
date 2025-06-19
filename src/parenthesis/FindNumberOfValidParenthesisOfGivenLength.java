package parenthesis;

public class FindNumberOfValidParenthesisOfGivenLength {
    public static void main(String[] args) {
        /**
         Input: 2
         Output: 1
         Explanation: There is only possible valid expression of length 2, "()"

         Input: 4
         Output: 2
         Explanation: Possible valid expression of length 4 are "(())" and "()()"

         Input: 6
         Output: 5
         Explanation: Possible valid expressions are ((())), ()(()), ()()(), (())() and (()())
         */
        int input = 4;
        int result = findNumberOfValidPossibilities(input);
        System.out.println(result);
    }

    private static int findNumberOfValidPossibilities(int n) {
        if(n<2 || n%2 ==1) {
            return 0;
        }
        int[] ans = { 0 };
        return helper(n / 2, n / 2, ans);
    }

    private static int helper(int left, int right, int[] ans) {

        // If no more left and right parentheses
        // are remaining, a valid combination is found
        if (left == 0 && right == 0) {
            ans[0]++;
            return ans[0];
        }

        // If more right parentheses than left, return
        // (invalid state)
        if (left > right) {
            return 0;
        }

        // Try adding a left parenthesis if available
        if (left > 0) {
            helper(left - 1, right, ans);
        }

        // Try adding a right parenthesis if available
        if (right > 0) {
            helper(left, right - 1, ans);
        }

        return ans[0];
    }
}
