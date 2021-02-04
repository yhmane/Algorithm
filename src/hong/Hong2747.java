package hong;
/*
https://www.acmicpc.net/problem/2747
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong2747 {
	static int[] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N + 1];
		dp[0] = 0;
		dp[1] = 1;
		
		getPivo(N);
		
		System.out.println(dp[N]);
	}
	
	public static void getPivo(int N) {
		for (int i = 2; i < N + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
	}
}
