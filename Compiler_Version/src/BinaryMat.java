import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BinaryMat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*int t,m,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		t = Integer.parseInt(str);
		
		str = br.readLine();
		m = Integer.parseInt(str);
		
		str = br.readLine();
		n = Integer.parseInt(str);
		
		System.out.println();*/
		
		int i, index, n, cases;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        cases = Integer.parseInt(line);
        for (index = 0; index < cases; index++) {
        	String inputs[] = br.readLine().split(" ");
        	n = Integer.parseInt(inputs[0]);
        	Set<String> rows = new HashSet<String>();
        	for(i=0; i<n; i++)
    			rows.add(br.readLine());
        	if(rows.size()==n)
        		System.out.println("Yes");
        	else
        		System.out.println("No");
        }
		
		
		
	}

}
