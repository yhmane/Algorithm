package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang11655 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder(); 
		String input = br.readLine();
		
		// 소문자, 대문자, 숫자, 공백
		// A - 65
		// Z - 90
		// a - 97
		// z - 122
		// white sp 32
		int len = input.length();
		for(int i = 0; i < len; i++) {
			char c = input.charAt(i);
			if(c >= 65 && c <= 77)         sb.append((char)(c + 13));
			else if(c >= 78  && c <= 90)   sb.append((char)(c - 13));
			else if(c >= 97  && c <= 109)  sb.append((char)(c + 13));
			else if(c >= 110 && c <= 122)  sb.append((char)(c - 13));
			else sb.append(c);
		}
		System.out.println(sb.toString());
	}
}