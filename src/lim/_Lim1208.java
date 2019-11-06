// https://kesakiyo.tistory.com/18

package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim1208 {
	private static int cnt = 0;
	private static int cursor = 0;
	private static int[] partSum = new int[1024 * 1024];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int[] seq = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		int middle = n / 2;
		
		for(int i = 0; i < middle; i++) {
			dfs1(i, seq, seq[i], s , middle);
		}
				
		for(int i = middle; i < n; i++) {
			dfs2(i, seq, seq[i], s);
		}
		
		System.out.println(cnt);
	}

	private static void dfs1(int i, int[] seq, int sum, int s, int middle) {
		
		if(sum == s) {
			cnt++;
		} else {
			partSum[cursor] = sum;
			cursor++;
		}
		
		for(int j = i + 1; j < middle; j++) {
			dfs1(j, seq, sum + seq[j], s, middle);
		}
	}
	
	private static void dfs2(int i, int[] seq, int sum, int s) {
		
		if(sum == s) {
			cnt++;
		} else {		
			cnt+= binarySearch(s - sum, partSum, 0, cursor - 1, cursor - 1);;
		}
		
		for(int j = i + 1; j < seq.length; j++) {
			dfs2(j, seq, sum + seq[j], s);
		}
	}

	private static int binarySearch(int target, int[] arr, int start, int end, int n) {
		
		int ret;
		
		int mid = (start + end) / 2;

		if(start == end && arr[mid] != target) {
			return 0;
		}
		
		if(arr[mid] > target) {
			ret = binarySearch(target, arr, start, mid - 1, n);
		} else if(arr[mid] < target) {
			ret = binarySearch(target, arr, mid + 1, end, n);
		} else {
			ret = 1;
			int tmp = mid;
			
			while(--tmp >= 0 && arr[tmp] == target) {
				ret++;
			}
			
			while(++mid <= n && arr[mid] == target) {
				ret++;
			}
		}
		
		
		return ret;
	}
}
