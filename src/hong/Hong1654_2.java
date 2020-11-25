package hong;
/*
https://www.acmicpc.net/problem/1654

반복문으로 이분탐색
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1654_2 {
	static long[] arr;
	static long N;
	static int K;
	static long lineLength = 0;
	static long answer = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new long[K];
		for (int i = 0; i < K; i++) {
			arr[i] = Long.parseLong(br.readLine());
			if (arr[i] > lineLength) {
				lineLength = arr[i];
			}
		}
		
		solution();
		
		System.out.println(answer);
	}
	
	public static void solution() {
		binarySearch(1, lineLength);
	}
	
	public static void binarySearch(long start, long end) {
		while (start <= end) {
			int result = 0;
			long mid = (end + start) / 2;
			
			for (int i = 0; i < K; i++) {
				result += arr[i] / mid;
			}
			
			if (result >= N) {
				if (mid > answer) {
					answer = mid;
				}
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
	}
 }
