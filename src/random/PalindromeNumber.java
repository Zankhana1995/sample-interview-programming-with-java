package random;

public class PalindromeNumber {
    public static void main(String[] args) {
       // boolean res = isPalindrome(1211);
      //  System.out.println(res);
        boolean result = isPalindromeConvertingToString(121211);
        System.out.println(result);
    }

    private static boolean isPalindromeConvertingToString(int n) {
        String s = String.valueOf(n);
        int left = 0;
        int right = s.length()-1;
        boolean result = true;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                result = false;
                break;
            }
            left ++;
            right --;
        }
        return result;
    }

    public static boolean isPalindrome(int x) {

        if (x< 0) {
            return false;
        }
        // String str = Integer.toString(x);
        // String reversed = new StringBuilder(str).reverse().toString();
        // return str.equals(reversed);
        int reverse =0;
        int original = x;
        while(x>0) {
            int digit = x%10;
            reverse = reverse*10 + digit;
            x=x/10;
        }
        return reverse == original;
    }
}
