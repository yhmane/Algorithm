package hong;
/*
https://www.acmicpc.net/problem/2805
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2805 {
	static int[] arr;
	static int max = 0;
	static int N;
	static int M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
		}
		
		System.out.println(binarySearch(1, max));
	}
	
	private static int binarySearch(int start, int end) {
		int result = 0;
		while (start <= end) {
			long wood = 0;
			int mid = (end + start) / 2;
			for (int i = 0; i < N; i++) {
				int length = arr[i] - mid;
				if (length > 0) {
					wood += length;
				}
			}
			
			if (wood >= M) { // 절단기 높이가 짧을 때
				if (mid > result) {
					result = mid;
				}
				start = mid + 1;
			} else { // 절단기 높이가 길 떄
				end = mid - 1;
			}
		}
		
		return result;
	}
}
