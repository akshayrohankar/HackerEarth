package interview.java;

public class Matrix_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][] = {{100,2,3},
						  {4,5,6},
						  {17,8,9}};
		
		int sum=0;
		int revSum=0;
		int length = matrix.length;
		
		   for (int i = 0; i < length; i++) 
	        { 
	            sum += matrix[i][i]; 
	            revSum += matrix[i][length-i-1]; 
	        } 
		
		if(sum>revSum)
			System.out.println("Clock "+sum);
		else
			System.out.println("AntiClock "+revSum);
		}
	}

