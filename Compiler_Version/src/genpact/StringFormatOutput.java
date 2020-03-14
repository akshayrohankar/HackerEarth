package genpact;

import java.util.Scanner;

public class StringFormatOutput {

		
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
          System.out.println("================================");
          for(int i=0;i<3;i++){
              String s1=sc.next();
              int x=sc.nextInt();
              String with3digits = String.format("%03d", x); //format number to add leading zeroes
              
              int wordSize = s1.length();
              
              int numberOfSpaces = 15-wordSize; // for equal number of spacing
              String space = String.format("%"+ numberOfSpaces +"s", " "); //formatting for no.of spaces instead of for loop.
              System.out.println(s1+space+with3digits);
              
              /*
               * 
Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================               
               * 
               * */
              
          }
          System.out.println("================================");
	}
	}


