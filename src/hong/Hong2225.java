package hong;

/*
합분해
0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 구하는 프로그램을 작성하시오.
덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우). 또한 한 개의 수를 여러 번 쓸 수도 있다.
첫째 줄에 두 정수 N(1 ≤ N ≤ 200), K(1 ≤ K ≤ 200)가 주어진다.
첫째 줄에 답을 1,000,000,000으로 나눈 나머지를 출력한다.
20 2 => 21
dp[K][N] = ∑(dp[K - 1][N - L]) K개를 더해서 합이 N일 경우. L은 합하는 수의 마지막 수. (0 <= L <= N)

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2225 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[][] dp = new long[K + 1][N + 1];
		
		for (int i = 0; i <= N; i++) {
			dp[1][i] = 1; // 한개로 i를 만드는 경우의 수
		}
		
		for (int i = 1; i <= K; i++) {
			for (int j = 0; j <= N; j++) {
				for (int l = 0; l <= j; l++) {
					dp[i][j] += dp[i - 1][j - l];
					dp[i][j] %= 1000000000;
				}
			}
		}
		
		System.out.println(dp[K][N]);
		br.close();
	}
}
