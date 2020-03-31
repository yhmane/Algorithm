package hong;
/*
RGB거리
RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이고, 첫 집과 마지막 집은 이웃이 아니다.
각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠하는 비용의 최솟값을 구하는 프로그램을 작성하시오.
첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로, 초록으로, 파랑으로 칠하는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
3
26 40 83
49 60 57
13 89 99 => 96
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1149 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N + 1][3];
		
		StringTokenizer st;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int costR = Integer.parseInt(st.nextToken());
			int costG = Integer.parseInt(st.nextToken());
			int costB = Integer.parseInt(st.nextToken());
			
			if (i == 1) {
				dp[i][0] = costR;
				dp[i][1] = costG;
				dp[i][2] = costB;
			} else {
				dp[i][0] = costR + (dp[i - 1][1] < dp[i - 1][2] ? dp[i - 1][1] : dp[i - 1][2]);
				dp[i][1] = costG + (dp[i - 1][0] < dp[i - 1][2] ? dp[i - 1][0] : dp[i - 1][2]);
				dp[i][2] = costB + (dp[i - 1][0] < dp[i - 1][1] ? dp[i - 1][0] : dp[i - 1][1]);
			}
		}
		
		int min = dp[N][0];
		if (dp[N][1] >= dp[N][2]) {
			if (dp[N][2] < min) {
				min = dp[N][2];
			}
		} else {
			if (dp[N][1] < min) {
				min = dp[N][1];
			}
		}
		
		System.out.println(min);
	}
}
