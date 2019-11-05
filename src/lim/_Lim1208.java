// https://kesakiyo.tistory.com/18

package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim1208 {
	private static int cnt = 0;
	private static List<Integer> list = new ArrayList<Integer>();
	
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
			dfs1(i, seq, seq[i], s);
		}
		
		for(int i = middle; i < n; i++) {
			dfs2(i, seq, seq[i], s);
		}
		
		System.out.println(cnt);
	}

	private static void dfs1(int i, int[] seq, int sum, int s) {
		
		if(sum == s) {
			cnt++;
		} else {
			list.add(sum);
		}
		
		for(int j = i + 1; j < seq.length; j++) {
			dfs1(j, seq, sum + seq[j], s);
		}
	}
	
	private static void dfs2(int i, int[] seq, int sum, int s) {
		
		if(sum == s) {
			cnt++;
		} else {
			int temp = 0;
			
			for(int elem : list) {
				if(elem + sum == s) {
					temp++;
				}
			}
			
			cnt+= temp;
		}
		
		for(int j = i + 1; j < seq.length; j++) {
			dfs1(j, seq, sum + seq[j], s);
		}
	}
}
