import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpUp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		for(int i=0;i<str.length;i++){

			String s1 = str[i].substring(0, 1).toUpperCase();
			String wordCapitalized = s1 + str[i].substring(1);
		
			System.out.print(wordCapitalized+" ");
		}
	}
}
