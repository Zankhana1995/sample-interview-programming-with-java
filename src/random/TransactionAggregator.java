package random;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionAggregator {
    public static void main(String[] args) {
        /**
         Given List/Array of String : ["A,100", "B,200", "A,50", "C,300"]

         Output :
         A → 150
         B → 200
         C → 300
         */
        List<String> transactions = List.of("A,100", "B,200", "A,50", "C,300");
        calculateAggregation(transactions);

    }

    private static void calculateAggregation(List<String> transactions) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String transaction : transactions) {

            if (transaction == null || transaction.isBlank()) {  // validation
                continue;
            }

            String[] parts = transaction.split(",");

            if (parts.length != 2) {
                continue; // malformed input
            }

            String account = parts[0];
            int amount = Integer.parseInt(parts[1]);
            resultMap.put(account, resultMap.getOrDefault(account, 0) + amount);
        }
        System.out.println(resultMap);
    }
}
