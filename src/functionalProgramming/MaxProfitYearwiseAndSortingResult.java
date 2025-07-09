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

        // Step 2: Get max profit per year
        Map<Integer, Double> maxProfitPerYear = new HashMap<>();
        for (Map.Entry<Integer, List<AnnualProfit>> entry : groupedByYear.entrySet()) {
            double maxProfit = entry.getValue().stream()
                    .mapToDouble(AnnualProfit::getProfit)
                    .max()
                    .orElse(0.0);

            maxProfitPerYear.put(entry.getKey(), maxProfit);
        }

        // Step 3: Sort by year and print
        maxProfitPerYear.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->
                        System.out.println("Year: " + entry.getKey() + ", Max Profit: " + entry.getValue())
                );
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
}
