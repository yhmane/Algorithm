package hong;
/*
https://www.acmicpc.net/problem/2468
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2468_2 {
	static int[][] map;
	static boolean[][] isSafe;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N;
	static int cnt;
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int maxHeight = -1;
	static int maxCount = 0;
	
	public static void main(String[] args) throws Exception {
		N = Integer.parseInt(br.readLine());
		
		drawMap();
		getCount();
		
		System.out.println(maxCount);
	}
	
	public static void drawMap() throws IOException {
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int height = Integer.parseInt(st.nextToken());
				
				maxHeight = Math.max(maxHeight, height);
				
				map[i][j] = height;
			}
		}
	}
	
	public static void getCount() {
		for (int i = 0; i <= maxHeight; i++) {
			isSafe = new boolean[N][N];
			int count = 0;
			
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (map[j][k] > i && !isSafe[j][k]) {
						dfs(j, k, i);
						count++;
					}
				}
			}
			
			maxCount = Math.max(maxCount, count);
		}
	}
	
	public static void dfs(int row, int col, int amount) {
		isSafe[row][col] = true;
		
		for (int i = 0; i < dx.length; i ++) {
			int newRow = row + dx[i];
			int newCol = col + dy[i];
			
			if (newRow >= 0 && newCol >= 0 && newRow < N && newCol < N) {
				if (map[newRow][newCol] > amount && !isSafe[newRow][newCol]) {
					dfs(newRow, newCol, amount);
				}
			}
		}
	}
}
