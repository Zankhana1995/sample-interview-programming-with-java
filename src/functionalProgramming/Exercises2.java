package functionalProgramming;

import java.util.List;

public class Exercises2 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring boot", "AWS", "Azure", "Google", "Docker", "Kubernetes");
        courses.forEach(System.out::println);
        List<String> filtered = courses.stream().filter(course -> course.equals("Spring")).toList();
        filtered.forEach(System.out::println);
        List<String> cList = checkLetters(courses);
        System.out.println("========");
        cList.forEach(System.out::println);
        printCharactersInCourseName(courses);
    }

    private static void printCharactersInCourseName(List<String> courses) {
        System.out.println("========= printCharactersInCourseName ========");
        courses.stream().map(x -> x.length()).forEach(System.out::println);
    }

    private static List<String> checkLetters(List<String> courses) {
        return courses.stream().filter(course -> course.length()>=4).toList();
    }
}
