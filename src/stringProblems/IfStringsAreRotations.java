package stringProblems;

public class IfStringsAreRotations {
    public static void main(String[] args) {
        /**
         * Input: s1 = "abcd", s2 = "cdab"
         * Output: true
         * Explanation: After 2 right rotations, s1 will become equal to s2.
         *
         * Input: s1 = "aab", s2 = "aba"
         * Output: true
         * Explanation: After 1 left rotation, s1 will become equal to s2.
         *
         * Input: s1 = "abcd", s2 = "acbd"
         * Output: false
         * Explanation: Strings are not rotations of each other.
         */

        String a = "abcd";
        String b = "cdab";
        System.out.println(isRotation(a,b));

    }

    private static boolean isRotation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        // The idea is to generate all possible rotations of the first string and check if any of these rotations match the second string.
        // If any rotation matches, the two strings are rotations of each other, otherwise they are not.
        for (int i = 0; i < a.length(); i++) {
            if (a.equals(b)) {
                return true;
            }
            char last = a.charAt(a.length() -1);
            a = last + a.substring(0,a.length()-1);
        }

        return a.equals(b);
    }
}
