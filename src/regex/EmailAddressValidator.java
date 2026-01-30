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

 Incorrect cases to be handled:
 .test@mail.com
 test.@mail.com
 test..abc@mail.com
 test@mail
 test@mail.c
 test@my_domain.com
 */