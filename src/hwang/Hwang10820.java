package hwang;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10820 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		// 소문자, 대문자, 숫자, 공백
		// 0 - 48
		// 9 - 57
		// A - 65
		// Z - 90
		// a - 97
		// z - 122
		// white sp 32
		while((input = br.readLine()) != null) {
			int[] arr = new int[4];
			int len = input.length();
			
			for(int i = 0; i < len; i++) {
				int c = input.charAt(i);
				
				if(c>=97 && c<=122)     arr[0]++;
				else if(c>=65 && c<=90) arr[1]++;
				else if(c>=48 && c<=57) arr[2]++;
				else if(c == 32)        arr[3]++;
			}
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
		}
	}
}
