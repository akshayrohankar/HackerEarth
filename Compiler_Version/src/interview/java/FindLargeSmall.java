package interview.java;

public class FindLargeSmall {

	public static void main(String[] args) {

		int numbers[] = { 10, 2, 55, 7, 95, 45, 74, 99, 46, 100 };
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Smallest "+smallest+" Largest "+largest);
	}
}
