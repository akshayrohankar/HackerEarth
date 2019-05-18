import java.util.Arrays;

public class MyMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(numArray);
		
		System.out.println(Arrays.toString(numArray));
		int middle = ((numArray.length) / 2);
		System.out.println("length "+numArray.length/2);
		int median;
		if(numArray.length % 2 == 0){
			int medianA = numArray[middle];
			int medianB = numArray[middle-1];
			median = (medianA + medianB) / 2;
		} else{
			median = numArray[middle + 1];
		}

		
		System.out.println(median);

	}

}
