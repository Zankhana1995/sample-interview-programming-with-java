package arrayAndCollectionsProblems;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        // [1,2,3,4,5,6]
        List<Integer> merged = mergeSortedLists(list1, list2);

        System.out.println(merged);
    }

    // Time complexity : O(n+m), space complexity : O(n+m)
    // n = size of list1, m = size of list2
    private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
}

/**
 * cases covered
 * • One list is empty
 * • Both lists empty
 * • Lists contain duplicate values // it'll print both
 * • Negative numbers
 * <p>
 * Your algorithm still works.
 */