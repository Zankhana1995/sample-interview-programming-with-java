package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsSplitBySpace {
    public static void main(String[] args) {
        String input = "I love my dad";
        // Output : dad my love I
        String[] splitted = input.split("\\s+"); // If you know that only one space then you can use split(" ");
        // StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i = splitted.length-1 ; i>=0 ; i--) {
           list.add(splitted[i]);
           // sb.append(splitted[i]).append(" ");   // If you use this then use with i>0, then add first word outside of loop
        }
        //sb.append(splitted[0]);

        String result = String.join(" ",list);
        System.out.println(result);
    }
}
