import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompilerVersion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		while(line != null){
			for(int i=0;i<line.length()-1;i++){

				if((line.charAt(i) == '/') && (line.charAt(i+1) == '/') ){
					break;
				}
				else if ((line.charAt(i) == '-') && (line.charAt(i+1) == '>')) {

					line = line.substring(0,i) +"."+line.substring(i+2);
				}
			}
			System.out.println(line);
			line = br.readLine();
		}
	}
}
