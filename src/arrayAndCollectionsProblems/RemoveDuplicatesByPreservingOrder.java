package arrayAndCollectionsProblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesByPreservingOrder {
    public static void main(String[] args) {
        /**
         input : [1,3,2,3,4,1]
         Output : [1,3,2,4]
         */

        int[] arr = {1,3,2,3,4,1};

        Set<Integer> set = new LinkedHashSet<>();
        for(int i : arr) {
            set.add(i);
        }

        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        // Or directly print set
        System.out.println(Arrays.toString(result));

    }
}
