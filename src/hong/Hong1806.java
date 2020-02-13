package hong;
/*
부분합
10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
10 15
5 1 3 5 10 7 4 9 2 8
========================
2

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1806 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solve(arr, N, S));
	}
	
	public static int solve(int[] arr, int N, int S) {
		int left = 0;
		int right = 0;
		long tempSum = arr[0];
		int res = arr.length + 1;
		
		if(S == 0) {
			return 0;
		}
		
		while (left <= right && right < N) {
			if(tempSum == S) {
				res = Math.min(res,	right - left + 1);
				tempSum += arr[++right];
			} else if (tempSum < S) {
				tempSum += arr[++right];
			} else if (tempSum > S) {
				res = Math.min(res, right - left + 1);
				tempSum -= arr[left++];
			}
		}
		
		if (res == arr.length + 1) {
			return 0;
		} else {
			return res;
		}
	}
}
