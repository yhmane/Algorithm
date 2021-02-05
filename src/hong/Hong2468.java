package hong;
/*
https://www.acmicpc.net/problem/2468
//bfs 로 풀었을 경우. 시간이 조금 더 오래 걸림.
//비의 양이 0인 경우도 고려해야함.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong2468 {
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
						bfs(j, k, i);
						count++;
					}
				}
			}
			
			maxCount = Math.max(maxCount, count);
		}
	}
	
	public static void bfs(int row, int col, int amount) {
		Queue<Integer> qRow = new LinkedList<Integer>();
		Queue<Integer> qCol = new LinkedList<Integer>();
		
		qRow.offer(row);
		qCol.offer(col);
		
		isSafe[row][col] = true;
		
		while (!qRow.isEmpty()) {
			int tempRow = qRow.poll();
			int tempCol = qCol.poll();
			
			
			for (int i = 0; i < dx.length; i ++) {
				int newRow = tempRow + dx[i];
				int newCol = tempCol + dy[i];
				
				if (newRow >= 0 && newCol >= 0 && newRow < N && newCol < N) {
					if (map[newRow][newCol] > amount && !isSafe[newRow][newCol]) {
						qRow.offer(newRow);
						qCol.offer(newCol);
						isSafe[newRow][newCol] = true;
					}
				}
			}
		}
	}
}
