package hong;
/*
10
10 -4 3 1 5 6 -35 12 21 -1
33

 */


import java.io.IOException;
import java.util.Scanner;

public class Hong1912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int[] dp = new int[caseNum];
		int[] arr = new int[caseNum];
		int max;
		
		for (int i = 0; i < caseNum; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		for(int i = 1; i < caseNum; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		
		
		System.out.println(max);
	}
}
