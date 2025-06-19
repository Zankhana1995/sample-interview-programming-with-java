package stringProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStringReturn {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "grapes", "orange", "banana", "kiwi"};
        String s = duplicateReturn(array);
        String res = duplicateReturnWithCollection(array);
        System.out.println(s);
        System.out.println(res);
    }

    private static String duplicateReturnWithCollection(String[] array) {
        List<String> input = Arrays.asList(array);
        String res = "";
        Set<String> set = new HashSet<>();
        for(String s : input) {
            if(!set.contains(s)) {
                set.add(s);
            }
            else {
                res += s;
            }
        }
        return res;
    }

    private static String duplicateReturn(String[] array) {
        boolean duplicate = false;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                result = array[i];
                break;
            }
        }
        return result;
    }
}
