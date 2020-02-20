package challenge;

import java.io.IOException;
import java.util.Scanner;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	
    	
    	
		return 0;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int n = scanner.nextInt();
        
        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);
        scanner.close();
    }
}
