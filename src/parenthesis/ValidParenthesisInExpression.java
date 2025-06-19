package parenthesis;

import java.util.Stack;

public class ValidParenthesisInExpression {
    public static void main(String[] args) {
        /**
         Input: s = "[{()}]"
         Output: true
         Explanation:  All the brackets are well-formed.

         Input: s = "[()()]{}"
         Output: true
         Explanation: All the brackets are well-formed.

         Input: s = "([]"
         Output: false
         Explanation: The expression is not balanced as there is a missing ')' at the end.

         Input:  s = "([{]})"
         Output: false
         Explanation: The expression is not balanced because there is a closing ']' before the closing '}'.
         */

        String s = "[()()]{}";
        System.out.println(checkValid(s));
    }

    private static boolean checkValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i=0; i<s.length();i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty() &&
                        ((st.peek() == '{' && s.charAt(i) == '}')
                        || (st.peek() == '(' && s.charAt(i) == ')')
                        || (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop();
                } else {
                    return false;
                    // comes to this case when the string is "}]"
                }
            }
        }
        return st.isEmpty();
    }
}
