package challenge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SocksPair {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
		
    	int out = 0;
    	Map <Integer,Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i=0;i<n;i++) {
    		
    		Integer count = map.get(ar[i]);
    		if(count==null) {
    			map.put(ar[i], 1);
    		}
    		else {
    			map.put(ar[i], ++count);
    		}
    	}
    	
		/*
		 * Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		 * 
		 * for(Entry<Integer,Integer> entry : entrySet) {
		 * 
		 * if(entry.getValue()%2==0) { out = entry.getValue()/2; } }
		 */
    	
    	
    	for(Integer freq : map.values()) {
    		out+=freq>>1 ;
    	}
    	
    	
    	return out;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     
    	
        int n = scanner.nextInt();

        int[] ar = new int[n];


        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

       int result = sockMerchant(n, ar);
       
       System.out.println("No. of pair of socks are: "+result);

        scanner.close();
    }
}
