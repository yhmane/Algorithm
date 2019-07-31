package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이를 다시할 필요는 없고, gcd를 왜 저렇게 구하는 것이 가능한지에 대한 이해 혹은 증명이 필요
public class _Lim1934_2 {
	public static void main(String[] args)throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(b > a) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			
			sb.append(a * b / gcd(a, b) + "\n");
		}
		
		System.out.println(sb);
	}
	
	private static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		
		return gcd(b, a % b);
	}
}
