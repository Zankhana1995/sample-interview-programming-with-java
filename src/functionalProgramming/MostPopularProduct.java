package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostPopularProduct {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer(1, Arrays.asList(101, 102, 103)),
                new Customer(2, Arrays.asList(101, 102)),
                new Customer(3, Arrays.asList(101, 104)),
                new Customer(4, Arrays.asList(102, 105))
        );

        Integer popularProduct = findMostPopularProduct(customers);
        System.out.println("Most popular product ID: " + popularProduct); // Output: 101
    }

    private static Integer findMostPopularProduct(List<Customer> customers) {
        Map<Integer, Long> productFrequencyMap =
                customers.stream()
                .flatMap(customer -> customer.getSubscriptions().stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxValue = productFrequencyMap.values().stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        List<Integer> resultList = productFrequencyMap.entrySet().stream()
                .filter(e -> e.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .toList();

        /**
         productFrequency.entrySet().stream()
            .max(Map.Entry.comparingByValue())
             .map(Map.Entry::getKey)
            .orElse(null);
         */

        return resultList.getFirst();
    }
}

class Customer {
    private Integer customerId;

    private List<Integer> subscriptions;   //Product subscription

    public Customer(Integer customerId, List<Integer> subscriptions) {
        this.customerId = customerId;
        this.subscriptions = subscriptions;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public List<Integer> getSubscriptions() {
        return subscriptions;
    }
}