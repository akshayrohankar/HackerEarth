package genpact;

import java.util.Scanner;

public class java2loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		  
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	            int tempSum=a;
	            for(int k=0;k<n;k++) {
	            	
	            	tempSum=tempSum+(int)Math.pow(2, k)*b;
	            	System.out.print(tempSum+" ");
	            }
	            System.out.println();
	        }
		
	        
	        

	}

}