package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang1212 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  stIn = new StringBuilder(br.readLine());
		StringBuilder  stOu = new StringBuilder();
		
		int len = stIn.length();
		for(int i = 0; i < len; i++) {
			int n = (int) stIn.charAt(i) - 48;
			StringBuilder sb = new StringBuilder();

			while(n > 0) {
				sb.append(n % 2);
				n /= 2;
			}

			if(i > 0) {
				if     (sb.length() == 0) { sb.append("000");   }
				else if(sb.length() == 1) { sb.insert(1, "00"); }
				else if(sb.length() == 2) { sb.insert(2, "0");  }
			}
			stOu.append(sb.reverse());
		}
		
		if(stOu.length() == 0) {stOu.append("0");}
		System.out.println(stOu.toString());
	}
}
