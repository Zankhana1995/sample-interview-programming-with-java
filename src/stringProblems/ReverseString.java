package stringProblems;

public class ReverseString {
    public static void main(String[] args) {

        /**
         * Input: s = "GeeksforGeeks"
         * Output: "skeeGrofskeeG"
         * Explanation : The first character G moves to last position, the second character e moves to second-last and so on.
         */
        String s = "GeeksforGeeks";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
