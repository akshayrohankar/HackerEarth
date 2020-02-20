package openText;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//without built-in
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String reverse = "";
		
		for(int i = s1.length()-1; i>=0 ;i--) {
			reverse = reverse+ s1.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		//with inbuilt function

		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb = sb.reverse();
		System.out.println(sb);
		
		//byte level
		
		byte[] StrAsByteArray = s1.getBytes();
		byte[] reverseb = new byte[StrAsByteArray.length];
		
		for(int i = 0; i<StrAsByteArray.length ;i++) {
			reverseb[i] = StrAsByteArray[StrAsByteArray.length-i-1];
		}
		
		System.out.println(new String(reverseb));
		
		

	}

}
