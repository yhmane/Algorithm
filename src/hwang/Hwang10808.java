package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int len = input.length();
		
		int[] cnt = new int[26];
		for(int i = 0; i < len; i++) {
			cnt[input.charAt(i) - 97]++;
		}
		
		
		for(int num : cnt) {
			sb.append(num + " ");
		}
		
		System.out.println(sb.toString());
	}
} 
