package functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class MaxProfitYearwiseAndSortingResult {
    public static void main(String[] args) {
        List<AnnualProfit> profits = Arrays.asList(
                new AnnualProfit(2021, 5000),
                new AnnualProfit(2022, 10000),
                new AnnualProfit(2021, 8000),
                new AnnualProfit(2022, 7000),
                new AnnualProfit(2023, 9000),
                new AnnualProfit(2023, 11000)
        );

        // Step 1: Group by year
        Map<Integer, List<AnnualProfit>> groupedByYear = profits.stream()
                .collect(Collectors.groupingBy(AnnualProfit::getYear));

        System.out.println("Step A Result => " + groupedByYear);

        // Step 2: Get max profit per year
        List<AnnualProfit> resultList = new ArrayList<>();
        Map<Integer, Double> maxProfitPerYear = new HashMap<>();
        for (Map.Entry<Integer, List<AnnualProfit>> entry : groupedByYear.entrySet()) {
            double maxProfit = entry.getValue().stream()
                    .mapToDouble(AnnualProfit::getProfit)
                    .max()
                    .orElse(0.0);
            AnnualProfit a = new AnnualProfit(entry.getKey(), maxProfit);
            resultList.add(a);
            maxProfitPerYear.put(entry.getKey(), maxProfit);
        }

        // Step 3 is done 3 ways, first being the easiest way
        // Step 3 (A) : Sort By year and Print
        System.out.println("List resultStep 3(A) " + resultList.stream().sorted(Comparator.comparing(x -> x.getYear())).toList());

        // Step 3 (B): Sort by year and print
        maxProfitPerYear.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->
                        System.out.println("Step 3(B) Year: " + entry.getKey() + ", Max Profit: " + entry.getValue())
                );


        // Step 3 (C)
        LinkedHashMap<Integer, Double> resultLinkedHashMap = maxProfitPerYear.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        System.out.println("Step 3(C) resultLinkedHashMap => " + resultLinkedHashMap);

    }
}

class AnnualProfit {
    private int year;
    private double profit;

    public AnnualProfit(int year, double profit) {
        this.year = year;
        this.profit = profit;
    }

    public int getYear() {
        return year;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "AnnualProfit{" +
                "year=" + year +
                ", profit=" + profit +
                '}';
    }
}
