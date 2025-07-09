package functionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentLettersUsingStream {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";

        Map<Character, Long> countMap = s.chars()
//                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),      // Group by the character itself
                        Collectors.counting()));  // Count occurrences in each group

       System.out.println("CountMap ==> " + countMap);


        // Find the max frequency
        long maxFrequency = countMap.values().stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);


        // Filter Character having max frequency
        List<Character> mostFrequentLetters = countMap.entrySet().stream()
                .filter(e -> e.getValue() == maxFrequency)
                .map(Map.Entry :: getKey)
                .toList();

        System.out.println(mostFrequentLetters.getFirst());


         // Count occurrences of a character
        String text = "Mississippi";
        long count = text.chars().filter(ch -> ch == 's').count();  // 4
        System.out.println("Count a specific character => " + count);
    }
}
