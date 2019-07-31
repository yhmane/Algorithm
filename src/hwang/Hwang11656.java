package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hwang11656 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int len = input.length();
		String[] dic = new String[len];
		
		for(int i = 0; i < len; i++) {
			dic[i] = input.substring(i);
		}
		
		Arrays.sort(dic);
		
		for(String s : dic) {
			System.out.println(s);
		}
	}
}