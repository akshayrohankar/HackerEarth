package collectionsExercise;// Find duplicate elements in an array.
// Solution - Using HashMap
//If same integer is already present then add method will return false.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElements_1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entryset = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entryset) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element is " + entry.getKey() + " Found " + entry.getValue() + " times");
            }
        }
    }
}
