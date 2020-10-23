package hong;
/*
https://www.acmicpc.net/problem/2178
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2178_2 {
	static int[][] graph;
	static boolean[][] visited;
	static int N;
	static int M;
	static int E;
	static int startPoint;
	static int[] dx = {0, 1, 0, -1}; //상하좌우
	static int[] dy = {1, 0, -1, 0};
	static int min = 10001;

	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String tempStr = br.readLine();
			for (int j = 0; j < M; j++) {
				graph[i][j] = (int)tempStr.charAt(j) - '0';
			}
		}
		
		dfs(0, 0, 1);
		System.out.println(min);
		
	}
	
	private static void dfs(int x, int y, int depth) {
		if (x == N - 1 && y == M - 1) {
			if (depth < min) {
				min = depth;
			}
		}
		
		for (int j = 0; j < 4; j++) {
			int tempX = x + dx[j];
			int tempY = y + dy[j];
			
			if (tempX >= 0 && tempY >=0 && tempX < N && tempY < M) {
				if (graph[tempX][tempY] == 1 && visited[tempX][tempY] == false) {
					visited[tempX][tempY] = true;
					dfs(tempX, tempY, depth + 1);
					visited[tempX][tempY] = false;
				}
			}
		}
	}
}
