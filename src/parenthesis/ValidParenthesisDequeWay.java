package parenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesisDequeWay {
    public static void main(String[] args) {
        /**
         Since Stack is legacy, ArrayDeque is preferred in modern Java
         I use Deque (ArrayDeque) to implement stack behavior.
         Parentheses matching is a LIFO problem, so stack is the optimal structure.
         */
        String s = "[()()]{}";
        // Input: s = "[{()}]"
        // Input: s = "([]"
        System.out.println(checkValidString(s));
    }

    private static boolean checkValidString(String s) {
        if(s.isEmpty() || s.length() < 2) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()
                    && ((c == ')' && stack.peek() == '(')
                    || (c == '}' && stack.peek() == '{')
                    || (c == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false; // "]}"
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }
}
/**
 Another way

 public static boolean isValid(String s) {

    Deque<Character> stack = new ArrayDeque<>();

     Map<Character, Character> map = new HashMap<>();
     map.put(')', '(');
     map.put('}', '{');
     map.put(']', '[');

    for (char ch : s.toCharArray()) {

         // Opening brackets
         if (map.containsValue(ch)) {
         stack.push(ch);
         }
         // Closing brackets
         else if (map.containsKey(ch)) {
         if (stack.isEmpty() || stack.pop() != map.get(ch)) {
         return false;
         }
        }
    }
 return stack.isEmpty();
 }

 */
