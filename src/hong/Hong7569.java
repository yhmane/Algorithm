package hong;
/*
https://www.acmicpc.net/problem/7569
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong7569 {
	static int N; //row
	static int M; //col
	static int H; //height
	static int[][][] map;
	static int day;
	static int[] dx = {0, 0, 0, 0, 1, -1};
	static int[] dy = {0, 0, 1, -1, 0, 0};
	static int[] dz = {1, -1, 0, 0, 0, 0};
	static Queue<coordinatePoint> pq = new LinkedList<Hong7569.coordinatePoint>();
	static int days = -1;
	
	static class coordinatePoint {
		int x; //row
		int y; //col
		int z; //height
		
		public coordinatePoint(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		map = new int[H][N][M];
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
					
					if (map[i][j][k] == 1) {
						pq.offer(new coordinatePoint(j, k, i));
					}
				}
			}
		}
		
		bfs();
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (map[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					if (map[i][j][k] > days) {
						days = map[i][j][k];
					}
				}
			}
		}
		
		System.out.println(days - 1);
	}
	
	private static void bfs() {
		while(!pq.isEmpty()) {
			int x = pq.peek().x;
			int y = pq.peek().y;
			int z = pq.peek().z;
			
			pq.poll();
			
			for (int i = 0; i < 6; i++) {
				int newRow = x + dx[i];
				int newCol = y + dy[i];
				int newHeight = z + dz[i];
				
				if (newRow >= 0 && newCol >= 0 && newHeight >= 0 && newRow < N && newHeight < H && newCol < M) {
					if (map[newHeight][newRow][newCol] == 0) {
						map[newHeight][newRow][newCol] = map[z][x][y] + 1;
						pq.offer(new coordinatePoint(newRow, newCol, newHeight));
					}
				}
			}
		}
		
	}
}
