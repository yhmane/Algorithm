package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10824 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		String ab = input[0] + input[1];
		String cd = input[2] + input[3];
		System.out.println(Long.parseLong(ab) + Long.parseLong(cd));
	}
}