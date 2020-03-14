package genpact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndOfFile {

	public static void main(String args[]) throws IOException {

		int i=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while(line!=null){
        	System.out.println((++i)+" "+line);
        	line = br.readLine();
        	}
	}

	}
