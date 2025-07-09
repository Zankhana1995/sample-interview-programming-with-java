package regex;

public class EmailAddressValidator {
    public static void main(String[] args) {
        String email = "user@example.com";
        boolean isValidEmail = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");
        System.out.println(isValidEmail);

    }
}
