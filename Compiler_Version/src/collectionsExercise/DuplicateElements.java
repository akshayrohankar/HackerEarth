package collectionsExercise;

// Find duplicate elements in an array.
// Solution - Using HashSet
//If same integer is already present then add method will return false.

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.add(arr[i]) == false) {
                System.out.println("Duplicate element found is " + arr[i]);
            }
        }
    }
}
