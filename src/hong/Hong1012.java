package hong;
/*
https://www.acmicpc.net/problem/1012
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1012 {
	static int N;
	static int M;
	static int K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	
	static int wormCount = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			visited = new boolean[N][M];
			wormCount = 0;
			
			while (K-- > 0) {
				st = new StringTokenizer(br.readLine());
				int col = Integer.parseInt(st.nextToken());
				int row = Integer.parseInt(st.nextToken());
				map[row][col] = 1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1 && visited[i][j] == false) {
						wormCount++;
						dfs(i, j);
					}
				}
			}
			
			System.out.println(wormCount);
		}
	}
	
	private static void dfs(int row, int col) {
		for (int i = 0; i < 4; i++) {
			int tempRow = row + dx[i];
			int tempCol = col + dy[i];
			
			if (tempRow >= 0 && tempCol >= 0 && tempRow < N && tempCol < M) {
				if (map[tempRow][tempCol] == 1 && visited[tempRow][tempCol] == false) {
					visited[tempRow][tempCol] = true;
					dfs(tempRow , tempCol);
				}
			}
		}
	}
}
