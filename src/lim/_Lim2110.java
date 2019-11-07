package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim2110 {
	private static List<List<Integer>> candidates = new ArrayList<List<Integer>>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] home = new int[n];
		
		for(int i = 0; i < n; i++) {
			home[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(home);
		
		int r = c - 2;
		int[] combArr = new int[r];
		
		combination(combArr, n, r, 0, 0, home);
		
		int max = Integer.MIN_VALUE;
		
		for(List<Integer> list : candidates) {
			int min = getMin(list);
			
			if(min > max) {
				max = min;
			}
		}
		
		System.out.println(max);
	}

	private static int getMin(List<Integer> list) {
		int min = list.get(1) - list.get(0);
		
		for(int i = 1; i + 1 < list.size(); i++) {
			int dist = list.get(i + 1) - list.get(i);
			
			if(dist < min) {
				min = dist;
			}
		}
		
		return min;
	}

	private static void combination(int[] combArr, int n, int r, int index, int target, int[] home) {
		
		if(r == 0) {
			List<Integer> list = new ArrayList<Integer>();
			
			list.add(home[0]);
			
			for(int i = 0; i < combArr.length; i++) {
				list.add(home[combArr[i]]);
			}
			
			list.add(home[n - 1]);
			
			candidates.add(list);
		} else if(n - target >= r) {
			combArr[index] = target;
			combination(combArr, n, r - 1, index + 1, target + 1, home);
			combination(combArr, n, r, index, target + 1, home);
		} 		
	}
}
