package stringProblems;

public class RemovingStarsAndCharsFromString {
    public static void main(String[] args) {
        String input = "leet**cod*e";
        // output : lecoe
        // Means remove amount of previous chars as number of stars
        StringBuilder result = new StringBuilder();

        for (int i =0 ; i< input.length() ; i++) {
            if(input.charAt(i) == '*' && !result.isEmpty()) {
                result.deleteCharAt(result.length()-1);
            } else {
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);

        // Alternatively can be done via stack
    }
}
