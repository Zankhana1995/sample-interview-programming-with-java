package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class UniqueSequence {
    public static void main(String[] args) {

        // Asked in citi bank round 1 with Hexaware
        String s = "cccdsdsscaab";
        // desired output : dscab
        char[] chars = s.toCharArray();
        String result = removeDups(chars);
        System.out.println(result);
    }

    private static String removeDups(char[] chars) {
        if (chars == null || chars.length == 0) {
            return "";
        }
        // list maintains insertion order
        List<String> list = new ArrayList<>();
       // List<Character> charList = new ArrayList<>();
        // charList.add(chars[0]);
        list.add(String.valueOf(chars[0]));

        for (int i=1;i<chars.length;i++) {
            if(list.contains(String.valueOf(chars[i]))){
                list.remove(String.valueOf(chars[i]));
                list.add(String.valueOf(chars[i]));
            } else
                list.add(String.valueOf(chars[i]));
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        return sb.toString();
    }
}
