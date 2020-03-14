package genpact;

import java.util.Scanner;

public class java {

		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				int num = sc.nextInt();
				int result = 0;
				
				for(int i=1;i<=10;i++) {
					
					result=num*i;
					
					System.out.println(num+" x "+i+" = "+result);
				}
				
				/*
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
				 * */
	    }
	}


