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
                // Or array[i].equals(array[i+1])
                return array[i+1];
            }
        }
        return "";
    }

    private static String duplicateReturnWithCollection(String[] array) {
        String res = "";
        Set<String> set = new HashSet<>();
        for(String s : array) {
            if(!set.contains(s)) {
                set.add(s);
            }
            else {
                res = s;
                break; // considering only one duplicate present
            }
        }
        return res;

        /*
        Another way :

         for (String s : strings) {
            if (!seen.add(s)) {  // if add fails, it's a duplicate
                result.append(s);
                break; // consider only one element duplicate
            }
        }
         */
    }

    private static String duplicateReturn(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i < array.length - 1 ; i++) {
            for (int j=i+1 ; j < array.length - 1 ; j++) {
                if(array[i].equals(array[j])) {
                    result.append(array[i]);
                    break;
                }
            }
        }
        return result.toString();
    }
}
