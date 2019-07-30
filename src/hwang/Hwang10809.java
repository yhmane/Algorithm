package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int len = input.length();
		
		int[] loc = new int[26];
		for(int i = 0; i < 26; i++) {
			loc[i] = -1;
		}
		
		for(int i = 0; i < len; i++) {
			int num = input.charAt(i) - 97;
			if(loc[num] == -1) loc[num] = i;
		}
		
		
		for(int num : loc) {
			sb.append(num + " ");
		}
		
		System.out.println(sb.toString());
	}
}
