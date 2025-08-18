package stringProblems;

import java.util.*;

public class DuplicateStringReturn {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "grapes", "orange", "banana", "kiwi"};
        String s = duplicateReturn(array);
        String res = duplicateReturnWithCollection(array);
        String result = usingSorting(array);
        System.out.println(s);
        System.out.println(res);
        System.out.println(result);
    }

    //easiest way and less complexity -> n log(n)
    private static String usingSorting(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array "+ Arrays.toString(array));
        for (int i=0; i < array.length -1 ; i++) {
            if (Objects.equals(array[i + 1], array[i])) {
                return array[i+1];
            }
        }
        return "";
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
