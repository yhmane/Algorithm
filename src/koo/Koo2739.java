package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 9; i++) {
			sb.append(n + " * " + i + " = " + n*i).append("\n");
		}
		
		System.out.print(sb);
	}
}
