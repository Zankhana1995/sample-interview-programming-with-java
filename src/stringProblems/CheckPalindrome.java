package stringProblems;

public class CheckPalindrome {
    public static void main(String[] args) {
        /**
         * Input: s = "abba"
         * Output: 1
         * Explanation: s is a palindrome
         *
         * Input: s = "abc"
         * Output: 0
         * Explanation: s is not a palindrome
         */
        String s = "abcba";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        for (int i=0;i<chars.length;i++) {
            if(chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                System.out.println("Not Palindrome");
                isPalindrome = false;
                break;
            }
        }
        /**
         * while (left < right)
         * {
         *      if(chars[left] == chars[right]) {
         *                 left++;
         *                 right--;
         *             } else {
         *                 System.out.println("Not Palindrome");
         *                 isPalindrome = false;
         *                 break;
         *  }
         */
        System.out.println(isPalindrome);
    }
}

/** Another way, reverse string, and verify if both are equals or not
     String s = "abba";
     char[] chars = s.toCharArray();
     int left = 0;
     int right = chars.length - 1;
     while (left < right) {
         char temp = chars[left];
         chars[left] = chars[right];
         chars[right] = temp;
         left ++;
         right --;
     }
     String result = new String(chars);
     System.out.println(s.equals(result));
 */