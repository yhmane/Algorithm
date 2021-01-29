package hong;
/*
https://www.acmicpc.net/problem/10757
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong10757 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String strN = st.nextToken();
		String strM = st.nextToken();
		
		bigIntAdd(strN, strM);
	}
	
	public static void bigIntAdd(String strN, String strM) {
		StringBuilder sb = new StringBuilder();
		if (strN.length() < strM.length()) {
			String temp = strM;
			strM = strN;
			strN = temp;
		}
		
		int maxLen = strN.length();
		int minLen = strM.length();
		
		int overTen = 0;
		for (int i = 0; i < maxLen; i++) {
			int n1 = strN.charAt(maxLen - i - 1) - '0';
			int n2 = 0;
			if (i < minLen) {
				n2 = strM.charAt(minLen - i - 1) - '0';
			}
			
			int sum = n1 + n2 + overTen;
			sb.append(sum % 10);
			
			if (sum >= 10) {
				overTen = 1;
			} else {
				overTen = 0;
			}
		}
		
		if (overTen > 0) {
			sb.append(overTen);
		}
		
		System.out.println(sb.reverse());
	}
}
