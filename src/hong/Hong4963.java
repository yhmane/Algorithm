package hong;
/*
https://www.acmicpc.net/problem/4963
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong4963 {
	static int w;
	static int h;
	static int[][] map;
	static boolean[][] visited;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0) {
				break;
			}
			
			drawMap();
			sb.append(countLand()).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void drawMap() throws IOException {
		map = new int[h][w];
		visited = new boolean[h][w];
		
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				map[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
	}
	
	public static int countLand() {
		int cnt = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					dfs(i , j);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void dfs(int row, int col) {
		visited[row][col] = true;
		
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				
				int newRow = row + i;
				int newCol = col + j;
				
				if (newRow >= 0 && newCol >= 0 && newRow < h && newCol < w) {
					if (map[newRow][newCol] == 1 && !visited[newRow][newCol]) {
						dfs(newRow, newCol);
					}
				}
			}
		}
	}
}
