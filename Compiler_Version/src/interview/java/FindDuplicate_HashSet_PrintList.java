package interview.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindDuplicate_HashSet_PrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int names[] = {1,2,3,4,5,2,1,2};

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (Integer str : names) {
			if (set.add(str) == false) {
				//System.out.println("Duplicate Element is " + str);
				list.add(str);
			}
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
