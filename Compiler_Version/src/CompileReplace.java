/* IMPORTANT: Multiple classes and nested static classes are supported */
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class CompileReplace {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(line!=null){
        
        	for(int i=0;i<line.length()-1;i++){
        			//if comment skip
        	if((line.charAt(i) == '/') && (line.charAt(i+1) == '/'))
        	     break;
        	else if(line.charAt(i)=='-' && line.charAt(i+1)=='>')
        	     line = line.substring(0,i)+"."+line.substring(i+2);
        	}
        	System.out.println(line);
        	line = br.readLine();
        }
        
    }
}