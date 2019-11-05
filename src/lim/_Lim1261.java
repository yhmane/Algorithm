package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1261 {
	private static int[] di = {1, 0, -1, 0};
	private static int[] dj = {0, 1, 0, -1};
	private static int N;
	private static int M;
	private static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			char[] row = br.readLine().toCharArray();
			
			for(int j = 0; j < M; j++) {
				map[i][j] = row[j] - 48;
			}
		}
		
		dfs(0, 0, map, visited, 0);
		
		System.out.println(min);
	}

	private static void dfs(int i, int j, int[][] map, boolean[][] visited, int cnt) {
		visited[i][j] = true;
		
		if(map[i][j] == 1) {
			cnt++;
		}
		
		if(cnt >= min) {
			return;
		}
		
		if(i == N - 1 && j == M - 1) {
			
			if(cnt < min) {
				min = cnt;
			}
			
			return;
		}
		
		for(int k = 0; k < 4; k++) {
			int newI = i + di[k];
			int newJ = j + dj[k];
			
			if(newI >= 0 && newI < N && newJ >= 0 && newJ < M && !visited[newI][newJ]) {
				dfs(newI, newJ, map, visited, cnt);
				visited[newI][newJ] = false;
			}
		}
	}
}
