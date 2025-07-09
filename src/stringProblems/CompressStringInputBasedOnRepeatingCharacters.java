package stringProblems;

public class CompressStringInputBasedOnRepeatingCharacters {
    public static void main(String[] args) {
        // Compress String inputstr = "aaabb3sdaab"; outputstr = "a3b23sda2b";
        String input = "aaabb3sdaab";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length() ; i++) {
            if (input.charAt(i-1) == input.charAt(i)) {
                count ++;
            } else {
                if (count == 1) {
                    sb.append(input.charAt(i - 1));
                } else {
                    sb.append(input.charAt(i - 1)).append(count);
                }
                count = 1;
            }
        }

        // Append the last group
        if (count == 1) {
            sb.append(input.charAt(input.length() - 1));
        } else {
            sb.append(input.charAt(input.length() - 1)).append(count);
        }
        System.out.println(sb);
    }
}
