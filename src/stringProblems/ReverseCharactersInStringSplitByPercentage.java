package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class ReverseCharactersInStringSplitByPercentage {
    public static void main(String[] args) {
        /**
         𝐈𝐧𝐩𝐮𝐭:
         "This is a tree"
         𝐎𝐮𝐭𝐩𝐮𝐭:
         "sihT%si%a%eert"
         */
        String input = "This is a tree";
        String[] array = input.split("\\s+");
        List<String> reversed = new ArrayList<>();

        for (String s : array) {
            StringBuilder sb = new StringBuilder(s).reverse();
            reversed.add(sb.toString());
        }

        String result = String.join("%",reversed);
        System.out.println(result);

    }

}
