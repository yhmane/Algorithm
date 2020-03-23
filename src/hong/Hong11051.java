package hong;
/*
이항 계수 2
자연수 과 정수 가 주어졌을 때 이항 계수 를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.
첫째 줄에 과 가 주어진다. (1 ≤ N≤ 1,000, 0 ≤ K≤N)
 를 10,007로 나눈 나머지를 출력한다.
 5 2 => 10
 ******* 파스칼의 삼각형 이용
 *dp[N][K] = dp[N - 1][K - 1] + dp[N - 1][K];
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11051 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] dp = new int[N + 1][N + 1];
		
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				if(i == j || j == 0) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 10007;
				}
			}
		}
		
		System.out.println(dp[N][K]);
	}
	
}
