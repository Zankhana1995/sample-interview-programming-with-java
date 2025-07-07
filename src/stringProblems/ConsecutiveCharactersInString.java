package stringProblems;

public class ConsecutiveCharactersInString {
    public static void main(String[] args) {
        // print consecutive characters in String with count of how many times they appeared
        String input = "aaabbbbccdddeeeffgghiii";
        findConsecutiveCharacters(input);
    }

    private static void findConsecutiveCharacters(String input) {
        if (input == null || input.length() < 3)
        {
            System.out.println("No characters found with more than two consecutive repetitions.");
            return;
        }
        char[] chars = input.toCharArray();
        char previous = chars[0];
        int count = 1;
        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == previous) {
                count++;
            }
            else {
                System.out.println(previous + " happens " + count + " times");
                previous = chars[i];
                count = 1;
            }
        }
        if(count >2) {
            System.out.println(previous + " happens " + count + " times");
        }
    }

    // Another way

}
