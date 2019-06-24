package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length; i++) {
			if(i%10 == 0 && i!= 0) {
				result.append("\n");
			}
			result.append(input[i]);
		}
		
		System.out.print(result);
	}
}
