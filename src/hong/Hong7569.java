package hong;
/*
https://www.acmicpc.net/problem/7569
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong7569 {
	static int N;
	static int M;
	static int H;
	static int[][][] map;
	static int day;
	static int[] dx = {0, 0, 0, 0, 1, -1};
	static int[] dy = {0, 0, 1, -1, 0, 0};
	static int[] dz = {1, -1, 0, 0, 0, 0};
	static class coordinatePoint {
		int x;
		int y;
		int z;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		map = new int[H][N][M];
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		bfs();
		
		System.out.println();
		
	}
	
	private static void bfs() {
		
	}
}
