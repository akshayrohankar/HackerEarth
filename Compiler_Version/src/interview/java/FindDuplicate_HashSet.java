package interview.java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "akshay", "prashant", "pratik", "arnav", "prasad", "akshay", "prashant", "akshay" };

		Set<String> set = new HashSet<String>();

		for (String str : names) {
			if (set.add(str) == false) {
				System.out.println("Duplicate Element is " + str);
			}
		}

	}
}
