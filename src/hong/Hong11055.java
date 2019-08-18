package hong;

/* 
가장 큰 증가 부분 수열

수열 A가 주어졌을 때, 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 인 경우에 합이 가장 큰 증가 부분 수열은 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 이고, 합은 113이다.

첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

첫째 줄에 수열 A의 합이 가장 큰 증가 부분 수열의 합을 출력한다.

10
1 100 2 50 60 3 5 6 7 8  => 113
*** 5
*** 3 2 1 2 3 처리가 좀 걸림
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11055 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[caseNum];
		
		for (int i = 0; i < caseNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[caseNum];
		
		dp[0] = arr[0];
		
		for (int i = 1; i < caseNum; i++) {
			int beforeMax = 0;
			dp[i] = arr[i];
			for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && arr[j] > beforeMax) {
					beforeMax = arr[j];
					dp[i] = dp[j] + arr[i];
				}
				
				if (beforeMax >= arr[j] && dp[j] + arr[i] > dp[i]) {
					dp[i] = dp[j] + arr[i];
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
