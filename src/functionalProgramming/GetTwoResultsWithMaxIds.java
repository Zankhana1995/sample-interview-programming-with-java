package functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class GetTwoResultsWithMaxIds {
    /* Merative */

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(101, "Alice", 30),
                new Person(203, "Bob", 25),
                new Person(150, "Charlie", 28),
                new Person(99, "David", 35),
                new Person(250, "Eve", 22)
        );

        List<Person> topTwo = getTwoWithMaxIds(people);

        System.out.println("Two persons with highest IDs:");
        for (Person person : topTwo) {
            System.out.println(person);
        }
    }

    private static List<Person> getTwoWithMaxIds(List<Person> people) {
        /*
         * TASK: Implement this method to return the two Person objects with the highest IDs.
         *
         * Requirements:
         * 1. The input is a List<Person> which contains at least two Person objects.
         * 2. Return a List<Person> containing exactly two Person objects with the highest 'id' values.
         * 3. The returned list should have the person with the highest id first.
         */
        List<Person> result =  people.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getId(), p1.getId())) // Sort in descending order of id
                .limit(2) // Take top 2
                .toList();
        return result; // Replace this with your implementation

        /**
         return people.stream()
         .sorted(Comparator.comparingInt(Person::getId).reversed())
         .limit(2)
         .collect(Collectors.toList());
         */

        /** For non-primitives (Object types) use only comparing
         | Getter return type | Best Comparator     |
         | ------------------ | ------------------- |
         | `int`              | `comparingInt` ✅    |
         | `long`             | `comparingLong` ✅   |
         | `double`           | `comparingDouble` ✅ |
         | `Integer`          | `comparing`         |
         | `String`           | `comparing`         |
         | `LocalDate`        | `comparing`         |
         */
    }
}

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

/**

 Interviewer asked : Do you need equals() and HashCode() methods in Person class ?
 Answer : No
 HashMap and HashSet rely on hashCode(), They use equals() to check duplicates.

 Right now your code uses:
 Sorting (Comparator), Limiting, No hashing, No equality checks

 So Java will just compare IDs using your comparator.
 No need for equals() / hashCode().

 */