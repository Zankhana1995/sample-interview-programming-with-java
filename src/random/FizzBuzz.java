package random;

public class FizzBuzz {

    public static void main(String[] args) {
        /**
         Print numbers from 1 to n, but:
         If number is divisible by 3 → print "Fizz"
         If number is divisible by 5 → print "Buzz"
         If number is divisible by both 3 and 5 → print "FizzBuzz"
         Otherwise print the number
         */

        int n = 15;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}