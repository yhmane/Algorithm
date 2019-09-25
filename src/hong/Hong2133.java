package hong;

/*
타일 채우기
3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.
첫째 줄에 경우의 수를 출력한다.
2 -> 3

***나중에 다시 풀어볼 것.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong2133 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		
		int answer = 0;
		if (N % 2 == 0) {
			dp[2] = 3;
			dp[0] = 1;
			for (int i = 4; i <= N; i+=2) {
				for (int j = 2; j <= i; j+=2) {
					int mul = j == 2 ? 3 : 2;
					dp[i] += mul * dp[i - j];
				}
			}
			answer = dp[N];
		}
		
		System.out.println(answer);
		br.close();
	}
}
