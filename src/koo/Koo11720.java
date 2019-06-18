package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split("");
		int result = 0;
		
		for (int i = 0; i < a; i++) {
			result += Integer.parseInt(input[i]);
		}
		
		System.out.println(result);
	}
}
