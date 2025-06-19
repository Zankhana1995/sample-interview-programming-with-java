package parenthesis;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        /**

         nput: str = "((()"
         Output: 2
         Explanation: Longest Valid Parentheses Substring is "()".

         Input: str = ")()())"
         Output: 4
         Explanation: Longest Valid Parentheses Substring is "()()".

         */
        String str = "((()";
        int res = findLongestValidString(str);
        System.out.println(res);
    }

    private static int findLongestValidString(String str) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        for (int i =0; i<str.length() ; i++) {
            if(str.charAt(i) == '(') {
                st.push('(');
            } else if (!st.isEmpty() && (str.charAt(i) == ')' && st.peek()=='(')) {
                res ++;
                st.pop();
            }
        }
        return res*2; // why into 2, I considered () as one valid expression, so basically they are 2 characters, so I multiplied
    }
}
