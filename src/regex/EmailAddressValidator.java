package regex;

public class EmailAddressValidator {
    public static void main(String[] args) {
        String email = "user@example.com";
        boolean isValidEmail = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");
        System.out.println(isValidEmail);

    }
}

/**
     private static final String EMAIL_REGEX =
     "^[A-Za-z0-9+_-]+(\\.[A-Za-z0-9+_-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}$";

     public static boolean isValid(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
 }

 | Rule                              | Covered |
 | --------------------------------- | ------- |
 | Letters & numbers                 | ✅       |
 | `.` not at start/end of username  | ✅       |
 | No double dots in username        | ✅       |
 | No underscore in domain           | ✅       |
 | Subdomains allowed                | ✅       |
 | TLD like `.com`, `.org`, `.co.in` | ✅       |
 | Upper/lowercase TLD               | ✅       |

 -> (\\.[A-Za-z0-9+_-]+)*
    means zero or more groups that start with a dot followed by valid characters.
    After the first word, allow any number of sections that start with a dot and have letters/numbers/symbols.
     This part allows:
     john
     john.doe
     john.doe.smith
     a.b.c
     No dot → OK
     One ".word" → OK
     Many ".word.word" → OK

 Incorrect cases to be handled by the EMAIL_REGEX:
 .test@mail.com
 test.@mail.com
 test..abc@mail.com
 test@mail
 test@mail.c
 test@my_domain.com
 */