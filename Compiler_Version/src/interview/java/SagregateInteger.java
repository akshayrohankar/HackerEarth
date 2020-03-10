package interview.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SagregateInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Manger Id : mngr247076";
		
		Pattern pattern = Pattern.compile("mngr");
		
		Matcher matcher = pattern.matcher(input);
		
		while (matcher.find()) 
            System.out.println("Pattern found from " + matcher.start() + 
                               " to " + (matcher.end()-1));
		
		System.out.println(Integer.parseInt(input.substring(16)));
		
		
	}

}
