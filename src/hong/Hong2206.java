package hong;
/*
https://www.acmicpc.net/problem/2206
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong2206 {
	static int[][] map;
	static int[][] resultMap;
	static boolean[][] visited;
	static int N;
	static int M;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N ; i++) {
			String strRow = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = strRow.charAt(j) - '0';
			}
		}
		
		if (N == 1 && M == 1) {
			System.out.println(1);
			return;
		}
		
		for (int i = 0; i < N ; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					resultMap = new int[N][M];
					visited = new boolean[N][M];
					map[i][j] = 0;
					bfs();
					map[i][j] = 1;
				}
			}
		}
		
		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min + 1);
		}
	}
	
	private static void bfs() {
		Queue<Integer> qRow = new LinkedList<Integer>();
		Queue<Integer> qCol = new LinkedList<Integer>();
		
		qRow.offer(0);
		qCol.offer(0);
		visited[0][0] = true;
		
		while (!qRow.isEmpty()) {
			int tempRow = qRow.poll();
			int tempCol = qCol.poll();
			
			for (int i = 0; i < 4; i++) {
				int newRow = tempRow + dx[i];
				int newCol = tempCol + dy[i];
				
				if (newRow >= 0 && newCol >= 0 && newRow < N && newCol < M) {
					if (map[newRow][newCol] == 0 && !visited[newRow][newCol]) {
						visited[newRow][newCol] = true;
						qRow.offer(newRow);
						qCol.offer(newCol);
						resultMap[newRow][newCol] = resultMap[tempRow][tempCol] + 1;
					}
				}
			}
		}
		
		int result = resultMap[N - 1][M - 1];
		if (result > 0) {
			min = Math.min(min, result);
		}
	}
}
