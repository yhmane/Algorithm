package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1707 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			boolean[][] matrix = new boolean[v + 1][v + 1];
			boolean[] visit = new boolean[v + 1];
			
			for(int j = 0; j < e; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				matrix[a][b] = true;
				matrix[b][a] = true;
			}
			
			int idx;
			
			while((idx = findRemainIdx(visit)) != -1) {
				dfsMethod(matrix, visit, idx);
				cnt++;
			}
			
			System.out.println(cnt);
		}
	}
	
	private static void dfsMethod(boolean[][] matrix, boolean[] visit, int s) {
		visit[s] = true;
		
		for(int i = 1; i < matrix[s].length; i++) {
			
			if(!visit[i] && !matrix[s][i]) {
				dfsMethod(matrix, visit, i);
			}
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
