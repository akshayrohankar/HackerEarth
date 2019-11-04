package interview.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "akshay", "prashant", "pratik", "arnav", "prasad", "akshay", "prashant", "akshay" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : names) {
			Integer count = map.get(str);

			if (count == null) {
				map.put(str, 1);
			} else {
				map.put(str, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is " + entry.getKey() + " Found " + entry.getValue() + " times");
			}
		}
	}
}