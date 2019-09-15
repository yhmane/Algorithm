package hong;
/*
쉬운 계단 수
45656이란 수를 보자.
이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
1 => 9, 2 => 17
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong10844 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[101][11];
		
		// dp[N][L] = dp[N - 1][L - 1] + dp[N - 1][L + 1]
		// 길이 N, 마지막 숫자가 L 일 경우
		
		for (int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			dp[i][0] = dp[i - 1][1];
			for (int j = 1; j <= 9; j++) {
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
			}
		}
		
		long sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += dp[N][i];
		}
		
		System.out.println(sum % 1000000000);
		
		br.close();
	}
	
}
