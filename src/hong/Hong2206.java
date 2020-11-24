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
	static boolean[][][] visited;
	static int N;
	static int M;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int min = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M][2];  // idx: 0 은 부순 벽 방문, 1은 일반 벽 방문;
		
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
		
		bfs();
	}
	
	private static void bfs() {
		Queue<Point> pq = new LinkedList<Point>();
		
		pq.offer(new Point(0, 0, 1, 0));
		visited[0][0][0] = true;
		visited[0][0][1] = true;
		
		while (!pq.isEmpty()) {
			Point p = pq.poll();
			
			if (p.row == N - 1 && p.col == M -1) {
//				map[tempRow][tempCol][0] = map[tempRow][tempCol][0];
				System.out.println(p.dist);
				return;
			}
			
			for (int i = 0; i < 4; i++) {
				int newRow = p.row + dx[i];
				int newCol = p.col + dy[i];
				int breakWall = p.breakWall;
				int dist = p.dist;
				
				if (newRow >= 0 && newCol >= 0 && newRow < N && newCol < M) {
					if (map[newRow][newCol] == 0) { // 벽이 아닌 곳
						if (!visited[newRow][newCol][breakWall]) {
							visited[newRow][newCol][breakWall] = true;
							pq.offer(new Point(newRow, newCol, dist + 1, breakWall));
						}
					} else { // 벽인 곳
						if (breakWall == 0 && !visited[newRow][newCol][1]) {
							visited[newRow][newCol][1] = true;
							pq.offer(new Point(newRow, newCol,  dist + 1, 1));
						}
					}
				}
			}
		}
		System.out.println(-1);
	}
	
	private static class Point {
		int row;
		int col;
		int dist;
		int breakWall; // 0 = 벽을 부순적 없음, 1 = 벽을 부순적 있음
		
		Point (int row, int col, int dist, int breakWall) {
			this.row = row;
			this.col = col;
			this.dist = dist;
			this.breakWall = breakWall;
		}
	}
}
