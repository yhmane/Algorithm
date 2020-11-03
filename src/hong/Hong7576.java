package hong;
/*
https://www.acmicpc.net/problem/7576
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong7576 {
	static int[][] map;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {-1, 1, 0, 0};
	static int day = 1;
	static int N;
	static int M;
	static Queue<Integer> qRow = new LinkedList<Integer>();
	static Queue<Integer> qCol = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					qRow.offer(i);
					qCol.offer(j);
				}
			}
		}
		
		bfs();
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 0) {
					System.out.println(-1);
					return;
				} else if (map[i][j] > 1) {
					day = Math.max(map[i][j], day);
				}
			}
		}
		
		System.out.println(day - 1);
	}
	
	private static void bfs() {
		while(!qRow.isEmpty()) {
			int row = qRow.poll();
			int col = qCol.poll();
			
			for (int i = 0; i < 4; i++) {
				int newRow = row + dx[i];
				int newCol = col + dy[i];
				
				if (newRow >= 0 && newCol >=0 && newRow < M && newCol < N) {
					if (map[newRow][newCol] == 0) {
						map[newRow][newCol] = map[row][col] + 1;
						qRow.offer(newRow);
						qCol.offer(newCol);
					}
				}
			}
		}
	}
}