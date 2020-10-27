package hong;
/*
https://www.acmicpc.net/problem/2667
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
================
3
7
8
9
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Hong2667_2 {
	static int[][] map;
	static boolean[][] visited;
	static int N;
	static int M;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int startPoint;
	static int result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String tempStr = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = (int)tempStr.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] > 0 && visited[i][j] == false) {
					result = 1;
					dfs(i, j);
					pq.add(result);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(pq.size()).append("\n");
		
		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void dfs(int s, int e) {
		visited[s][e] = true;
		
		for (int i = 0; i < 4; i++) {
			int tempX = s + dx[i];
			int tempY = e + dy[i];
			
			if (tempX >= 0 && tempY >= 0 && tempX < N && tempY < N) {
				if (map[tempX][tempY] == 1 && visited[tempX][tempY] == false) {
					result++;
					visited[tempX][tempY] = true;
					dfs(tempX, tempY);
				}
			}
		}
	}
}
