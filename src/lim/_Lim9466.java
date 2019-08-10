package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
			
			for(int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int idx;
			int cnt = 0;
			
			while((idx = findRemainIdx(visit)) != -1) {
				List<Integer> list = new ArrayList<Integer>();
				cnt += search(arr, visit, list, idx);
			}
			
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
	}
	
    private static int search(int[] arr, boolean[] visit, List<Integer> list, int idx) {
		int ret;
		list.add(idx);
		visit[idx] = true;
		
		if((ret = list.indexOf(arr[idx])) != -1) {
			return ret;
		} else if(visit[arr[idx]]) {
			return list.size();
		} else {
			return search(arr, visit, list, arr[idx]);
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
