package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim9466 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());			
			int[] arr = new int[n + 1];
			boolean[] visit = new boolean[n + 1];
			boolean[] done = new boolean[n + 1];
			
			for(int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int idx;
			int cnt = 0;
			
			while((idx = findRemainIdx(visit)) != -1) {
				boolean[] localVisit = new boolean[n + 1];
				search(arr, localVisit, done, idx, visit);
			}
			
			for(int j = 1; j <= n; j++) {
				
				if(!done[j]) {
					cnt++;
				}
			}
			
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
	}
	
    private static void search(int[] arr, boolean[] localVisit, boolean[] done, int idx, boolean[] visit) {
		localVisit[idx] = true;
		visit[idx] = true;
		
		if(!visit[arr[idx]]) {
			search(arr, localVisit, done, arr[idx], visit);
		} else if(localVisit[arr[idx]] && !done[arr[idx]]) {
			done[arr[idx]] = true;
			search(arr, localVisit, done, arr[idx], visit);
		}
	}

	private static int findRemainIdx(boolean[] visit) {
		int ret = -1;
		
		for(int i = 1; i < visit.length; i++) {
			
			if(!visit[i]) {
				ret = i;
				break;
			}
		}
		
		return ret;
	}
}