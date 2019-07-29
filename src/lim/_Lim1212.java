package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Lim1212 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int len = input.length();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < len; i++) {
			int n = input.charAt(i) - 48;
			int tmp = 0;
			int multiplyer = 1;
			
			while(n > 0) {
				tmp += (n % 2) * multiplyer;
				n /= 2;
				multiplyer *= 10;
			}
						
			System.out.println(tmp);
			sb.append(tmp);
		}
		
		System.out.println(sb);
	}
}
