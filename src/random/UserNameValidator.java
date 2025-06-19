package random;

public class UserNameValidator {
    public static void main(String[] args) {
        /**
         Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine if the string is a valid username according to the following rules:

         1. The username is between 4 and 25 characters.
         2. It must start with a letter.
         3. It can only contain letters, numbers, and the underscore character.
         4. It cannot end with an underscore character.

         If the username is valid then your program should return the string true, otherwise return the string false.

         Input: "aa_"
         Output: false

         Input: "u__hello_world123"
         Output: true
         */

        // The full regex is as below
        // public static String CodelandUsernameValidation(String str) {
        //    return str.matches("^[A-Za-z][A-Za-z0-9_]{2,23}[A-Za-z0-9]$") ? "true" : "false"; }

        String s = "u__hello_world123";
        boolean result = usernameValidation(s);
        System.out.println(result);
    }

    private static boolean usernameValidation(String s) {
        if (s.length() > 25 || s.length() < 4) {
            return false;
        }

        // if(s.charAt(s.length() - 1) == '_') {
        //   return false;
        // }
        // use above or below

//        if(s.endsWith("_")) {
//            return false;
//        }
//
//        // ^[A-Za-z][A-Za-z0-9_]*$   <- This regex will check
//        if (!Character.isLetter(s.charAt(0))) {
//            return false;
//        }

        /**
         Explanation:
         ^ –> Start of string
         [A-Za-z0-9_] –> Allowed characters: uppercase letters, lowercase letters, digits, and underscore
         + –> One or more of the allowed characters
         $ –> End of string
         */
//        if (!s.matches("^[a-zA-Z0-9_]+$")) {
//            return false;
//        }

        if(!s.matches("^[A-Za-z][A-Za-z0-9_]*[A-Za-z0-9]$")) {
            return false;
            // This regex will check all 3 conditions, starts with letter, shouldn't end with underscore, only contains letter, numbers and underscores
        }

        /**
        OR another way :
         for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
         return "false";
         }
         }
         */

        return true;
    }
}
