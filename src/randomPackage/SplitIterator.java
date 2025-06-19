package randomPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Spliterator<Integer> spliterator1 = numbers.spliterator();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
        Spliterator<Integer> spliterator3 = spliterator2.trySplit();

        System.out.println("Spliterator 1:");
        spliterator1.forEachRemaining(System.out::println);

        System.out.println("Spliterator 2:");
        spliterator2.forEachRemaining(System.out::println);

        System.out.println("Spliterator 3:");
        spliterator3.forEachRemaining(System.out::println);

        System.out.println();
        // --------------------------------------------

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Spliterator<String> spliterator = names.spliterator();

        // Estimate size
        System.out.println("Estimated size: " + spliterator.estimateSize());

        // Traverse using tryAdvance
        spliterator.tryAdvance(name -> System.out.println("First name: " + name));

        // Use forEachRemaining
        spliterator.forEachRemaining(name -> System.out.println("Remaining: " + name));

    }
}
