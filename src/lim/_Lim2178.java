package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim2178 {
	private static int[] di = {1, 0, -1, 0};
	private static int[] dj = {0, 1, 0, -1};
	private static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[][] maze = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < m; j++) {
				
				if(input.charAt(j) == '1') {
					maze[i][j] = true;
				}
			}
		}
		
		boolean[][] visit = new boolean[n][m];
		search(maze, 0, 0, visit, n, m, 0);
		
		int min = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		
		System.out.println(min);
	}

	private static void search(boolean[][] maze, int i, int j, boolean[][] visit, int n, int m, int cnt) {
		visit[i][j] = true;
		cnt++;
		
		if(i == n - 1 && j == m - 1) {
			list.add(cnt);
			return;
		}
		
		for(int k = 0; k < 4; k++) {
			
			int nextI = i + di[k];
			int nextJ = j + dj[k];
			
			if(nextI >= n || nextJ >= m || nextI < 0 || nextJ < 0) {
				continue;
			}
			
			if(maze[nextI][nextJ] && !visit[nextI][nextJ]) {
				boolean[][] newVisit = new boolean[n][m];
				
				for(int l = 0; l < n; l++) {
					System.arraycopy(visit[l], 0, newVisit[l], 0, m);
				}
				
				search(maze, nextI, nextJ, newVisit, n, m, cnt);
			}
		}
	}
}
