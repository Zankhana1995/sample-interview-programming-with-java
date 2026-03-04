package arrayAndCollectionsProblems;

import java.util.*;

public class RemoveDuplicateFromArrayUsingCollection {
    public static void main(String[] args) {
        // Example array
        String[] array = {"apple", "banana", "apple", "orange", "banana"};

        // Convert Array to List
        List<String> stringList = new ArrayList<>(Arrays.asList(array));

        // Convert List to Set, LinkedHashSet to maintain insertion order
        Set<String> set = new LinkedHashSet<>(stringList);
        // Or directly convert Array to set.
        // Set<String> setTwo = new LinkedHashSet<>(Arrays.asList(array));

        // Convert back to array (Just for knowledge, not needed here)
        String[] finalResult = set.toArray(new String[0]);

        System.out.println(Arrays.toString(finalResult));


    }
}
