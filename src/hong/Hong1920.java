package hong;
/*
수 찾기
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
첫째 줄에 자연수 N(1≤N≤100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1≤M≤100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
5
4 1 5 2 3
5
1 3 7 9 5
==================================
1
1
0
0
1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Hong1920 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			long num = Long.parseLong(st.nextToken());
			sb.append(findNum(arr, num, 0, N - 1));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int findNum (long[] arr, long num, int start, int end) {
		int result = 0;
		if (start > end) {
			return 0;
		}
		
		int idx = (start + end) / 2;
		if (arr[idx] < num) {
			result =  findNum(arr, num, idx + 1, end);
		} else if (arr[idx] > num) {
			result =  findNum(arr, num, start, idx - 1);
		} else {
			result = 1;
		}
		
		return result;
		
	}
}
