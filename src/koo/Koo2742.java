package koo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Koo2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n>0) {
			for (int i = n; i > 0; i--) {
				System.out.println(i);
			}
		}
	}
}
