/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class PalindromicChotu {
    public static void main(String args[] ) throws Exception {
        
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
       
    	
        
        for (int i = 0; i < T; i++)
        {
        	//ArrayList<Character> list = new ArrayList<Character>();
        	String s1= br.readLine();
        	String s2= br.readLine();
        	StringBuilder s3= new StringBuilder(s1);
        	StringBuilder s4= new StringBuilder(s2);
        	//StringBuilder s7= new StringBuilder(s2);
        	String s5=s3.append(s4).toString(); // s1||s2
        	StringBuilder s7= new StringBuilder(s5);
        	String s6=s4.append(s1).toString();//s2||s1
        	StringBuilder s8= new StringBuilder(s6);
        	
        	System.out.println("S1: "+s1+" "+"S2: "+s2+" "+"S3: "+s3+" "+"S4: "+s4+" "+"S5: "+s5+" "+"S6: "+s6+" "+"S1: "+s1+" "+"S1: "+s1+" ");
        	
        //	System.out.println(s5 + " " + s6);
        	if(s5.equals(s7.reverse().toString()) || s6.equals(s8.reverse().toString()))
        	{
        		System.out.println("YES");
        		
        	}
        	else
        	{
        		System.out.println("NO");
        	}
        	
       
        }
        
    }
}
 