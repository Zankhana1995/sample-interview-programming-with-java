package stringProblems;

public class StringVariousCharacterCounter {
    public static void main(String[] args) {
        String input = "#GeeKs01fOr@gEEks07";
        // separate and Count the numbers, alphabets and special characters

        int letters = 0;
        int digits = 0;
        int special = 0;

        char[] charArray = input.toCharArray();

        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                letters ++;
            } else if (Character.isDigit(ch)) {
                digits ++;
            } else {
                special ++;
            }
        }
        System.out.println("letters => " + letters);
        System.out.println("Digits => " + digits);
        System.out.println("Special Characters => " + special);
    }
}
