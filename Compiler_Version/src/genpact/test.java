package genpact;

import java.util.ArrayList;
import java.util.List;

public class test {

		
		
		public static List<Integer> fibonacci(int n) {
		int n1=0;
	     int n2=1;
	     int n3;
	     int count=0;

	     List <Integer> list = new ArrayList<Integer>();
	     List <Integer> listEmpty = new ArrayList<Integer>();
	     list.add(n1);
	     list.add(n2);

	     

	     for(int i=2;i<n;i++){

	         n3=n1+n2;
	         list.add(n3);
	         n1=list.get(i-1);
	         n2=n3;
	     }
	     
	   return list;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println(fibonacci(8));
	    }
	}


