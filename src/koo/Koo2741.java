package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo2741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n>0) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
	}
}
