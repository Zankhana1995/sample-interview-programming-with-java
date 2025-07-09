package arrayProblems;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConvertToListViceVersa {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        for (int num : intArray) {
            list.add(num); // Auto-boxing from int to Integer
        }
        System.out.println(list);

        List<Integer> integerList = Arrays.stream(intArray)      // Convert int[] to IntStream
                .boxed()               // Convert each int to Integer (boxing)
                .toList(); // Collect as List<Integer>


        // ------------- String Array ------------ //

        String[] stringArray = {"Apple", "Banana", "Orange", "Kiwi"};
        List<String> stringList = List.of(stringArray);
        System.out.println("stringList => " + stringList);

        String[] stringArrayResult = stringList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArrayResult));
    }
}
