package genpact;

public class test2 {

		
		
		public static String shiftString(String str,int leftRotate,int rightRotate) {
			String result= str.substring(leftRotate) + str.substring(0, leftRotate); 
			String newResult = result.substring(result.length()-rightRotate) + result.substring(0, result.length()-rightRotate);
			
			return newResult;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println(shiftString("abcd",1,2));
			
	    }
	}


