package interview.java;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "akshay", "prashant", "pratik", "arnav", "prasad", "akshay","prashant","akshay" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {

				if(names[i].equals(names[j])) {
					System.out.println("Duplicate Element is "+names[j]);
				}
			}
		}
	}
}
