package functionalProgramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {


       // printAllNumbersInListStructured(List.of(1,2,3,4,5,6,7,8,9));
        // findEvenNumber(List.of(1,2,3,4,5,6,7,8,9));
        SquaresOfEvenNumbers(List.of(1,2,3,4,5,6,7,8,9));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
       integers.forEach(FP01Functional::print);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void findEvenNumber(List<Integer> integers) {
       List<Integer>  finalList = integers.stream().filter(n -> n%2==0).toList();
       finalList.forEach(FP01Functional::print);
    }

    private static void SquaresOfEvenNumbers(List<Integer> numList) {
        System.out.println();
        numList.stream().filter(n -> n%2!=0).map(n -> n*n*n).forEach(FP01Functional::print);
    }
}
