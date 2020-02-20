package challenge;

import java.util.ArrayList;
import java.util.List;

public class MissingDigit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultFinal = 0;
		int digitsCount = 0;
		int i=0;

		String temp = "0861";
		char[] intStr = {};
		intStr = temp.toCharArray();
		digitsCount=intStr.length;
		System.out.println(intStr);
		System.out.println(digitsCount);
		int[] intArray = new int[digitsCount-1];
		
		for(char ch:intStr) {
			intArray[i++]=ch;
			System.out.println(intArray[i]);
		}
		
		

		// resultFinal=doubleValueOperation(array,digitsCount);

		// System.out.println("Result "+resultFinal);

	}

	public static int doubleValueOperation(List<Integer> array, int digitsCount) {
		// t--->number of test cases
		// numbers each containing d digits.

		int temp = 0;
		boolean isDoubleDigit = false;

		return temp;
	}

	static int getSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

}

//OUTPUT
/*
 * [9, 8, 7, 6, 5, 4, 3, 2, 1] 7 [0, 9, 8, 7, 6, 5, 4, 3, 2, 1] 10 Result 51
 */