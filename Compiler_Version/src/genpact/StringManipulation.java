package genpact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//A string was given "Genpact headstrong marketing limited" I had to make it as "Genpact limited marketing headstrong".

public class StringManipulation {

	public static void main(String[] args) {

		String input = "Genpact headstrong marketing limited";
		StringBuffer result = new StringBuffer();
		
		String[] array = input.split(" ");
		List<String> vector = new ArrayList<String>();
		for (int m = 0; m < array.length; m++) {
			vector.add(array[m]);
		}
		
		Collections.swap(vector, 1, 3);
		System.out.println("\nAfter swap: " + vector);
		
		for (int n = 0; n < vector.size(); n++) {
			result = result.append(vector.get(n) + " ");
		}
		System.out.println(result);
	}

}
