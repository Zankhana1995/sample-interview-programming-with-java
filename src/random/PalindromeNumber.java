package random;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean res = isPalindrome(121);
        System.out.println(res);
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
