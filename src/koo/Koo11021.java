package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 1; i < a+1; i++) {
			String[] inputs = br.readLine().split(" ");
			result.append("Case #" + i + ": " + (Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1])) + "\n");
		}
		
		System.out.println(result);
	}
}
