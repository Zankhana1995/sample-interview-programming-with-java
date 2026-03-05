package stringProblems;

// CIBC interview
public class BooleanExpressionEvaluator {
    public static void main(String[] args) {
        // Evaluation will be done left to right
        System.out.println(evaluate("true")); // true
        System.out.println(evaluate("true | false")); // true
        System.out.println(evaluate("false | false")); // false
        System.out.println(evaluate("true | false & true & false")); // false
        System.out.println(evaluate("true | false & true | false & true & false")); // false

    }

    public static boolean evaluate(String expression) {

        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be null or empty");
        }

        String[] tokens = expression.trim().split("\\s+");

        // Tokens count must be odd. e.g. boolean operator boolean operator boolean
        if (tokens.length % 2 == 0) {
            throw new IllegalArgumentException("Invalid expression format");
        }

        boolean result = Boolean.parseBoolean(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {

            String operator = tokens[i];
            boolean value = Boolean.parseBoolean(tokens[i + 1]);

            if (operator.equals("|")) {
                result = result || value;
            } else if (operator.equals("&")) {
                result = result && value;
            }
        }

        return result;
    }
}

// In above code, It's assumed that operand must be true or false.
// Operator will be only | or &
// No missing operand and operator