package genpact;

import java.util.Scanner;

public class StaticInitBlock {

	static String MyExceptionMsg="java.lang.Exception: Breadth and height must be positive";
	static int B,H;
	static boolean flag=true;
	
	static {
		Scanner scan = new Scanner(System.in);
		B=scan.nextInt();
		H=scan.nextInt();
		
		if(B>0 && H>0) flag=true;
		else if((B<=0 && H>=0)||(B>=0 && H<=0)||(B<0 && H<0)) {
			flag=false;
			System.out.println(MyExceptionMsg);
		}
	}

	public static void main(String[] args){
		
		
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
		}//end of main

	}//end of class
