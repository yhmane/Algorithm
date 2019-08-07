package lim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim2004 {
	private static int two = 0;
	private static int five = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < m; i++) {
			cal(n--);
		}
		
		for(int i = 2; i <= m; i++) {
			cal2(i);
		}
		
		System.out.println(Math.min(two, five));
	}
	
	private static void cal(int n) {
		
		while(n % 2 == 0) {
			n /= 2;
			two++;
		}
		
		while(n % 5 == 0) {
			n /= 5;
			five++;
		}
	}
	
	private static void cal2(int n) {
		
		while(n % 2 == 0) {
			n /= 2;
			two--;
		}
		
		while(n % 5 == 0) {
			n /= 5;
			five--;
		}
	}
}
