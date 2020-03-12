package genpact;

public class CodingChallenge {

	

		 
	        //////Shifting String
	        
	     // Java program for Left Rotation and Right 
	   
	     		
	     	// function that rotates s towards left by d 
	     	static String leftrotate(String str, int d) 
	     	{ 
	     			String ans = str.substring(d) + str.substring(0, d); 
	     			return ans; 
	     	} 

	     	// function that rotates s towards right by d 
	     	static String rightrotate(String str, int d) 
	     	{ 
	     			return leftrotate(str, str.length() - d); 
	     	} 
	     	
	     	

	     	// Driver code 
	     	public static void main(String args[]) 
	     	{ 
	     			String str1 = "GeeksforGeeks"; 
	     			System.out.println(leftrotate(str1, 2)); 

	     			String str2 = "GeeksforGeeks"; 
	     			System.out.println(rightrotate(str2, 2)); 

	     			StringBuilder inputStringRes = new StringBuilder(str1);
	     			
	     			
	     			String str = "a";
	     			System.out.println(str.length());

	     // This code is contributed by rachana soma 

	}

}