package hong;

/* 
가장 긴 감소하는 부분 수열

수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 30, 10, 20, 20, 10} 인 경우에 가장 긴 감소하는 부분 수열은 A = {10, 30, 10, 20, 20, 10}  이고, 길이는 3이다.

첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.

6
10 30 10 20 20 10 => 3

** 뒤에서부터 증가하는 가장 긴 수열을 구하는 방식으로 풀어봄.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hong11722 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] dp = new int[caseNum];
		
		dp[caseNum - 1] = 1;
		
		for (int i = caseNum - 1; i >= 0; i--) {
			dp[i] = 1;
			for (int j = caseNum - 1; j >= i; j--) {
				if(arr[i] > arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
				} else if(arr[i] == arr[j]) {
					dp[i] = dp[j];
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < caseNum; i++) {
			max = Math.max(dp[i], max);
		}
		
		System.out.println(max);
		br.close();
	}
}
