package stringProblems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogAnalyzer {
    public static void main(String[] args) {

        List<String> logs = List.of(
                "ERROR DB connection",
                "INFO service started",
                "ERROR timeout"
        );

        //Output : {ERROR=2, INFO=1}

        Map<String, Integer> result = analyzeLogs(logs);

        System.out.println(result);
    }

    // O(n) time complexity, O(k) space complexity : where k = number of unique log levels.
    private static Map<String, Integer> analyzeLogs(List<String> logs) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String log : logs) {
            if(log == null || log.isEmpty()) {
                continue;
            }
            String logLevel = log.split("\\s+")[0]; // avoids unnecessary splitting, just take 1st element
            resultMap.put(logLevel, resultMap.getOrDefault(logLevel, 0) + 1);
        }
        return resultMap;
    }
}
