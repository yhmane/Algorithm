package hong;
/*
https://www.acmicpc.net/problem/1012
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong1012 {
	static int[][] map;
	static boolean[][] visited;
	static StringTokenizer st;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int N;
	static int M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int areaCount = 0;
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			visited = new boolean[N][M];
			
			while (K-- > 0) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				map[Y][X] = 1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						System.out.println("i = " + i + " j = " + j);
						bfs(i,  j);
						areaCount++;
					}
				}
			}
			
			sb.append(areaCount).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void bfs(int x, int y) {
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();
		
		queueX.add(x);
		queueY.add(y);
		
		
		while (!queueX.isEmpty()) {
			queueX.poll();
			queueY.poll();
			visited[x][y] = true;
			
			for (int i = 0; i < 4; i++) {
				int tempX = x + dx[i];
				int tempY = y + dy[i];
				
				if (tempX >= 0 && tempY >= 0 && tempX < N && tempY < M) {
					if (map[tempX][tempY] == 1 && !visited[tempX][tempY]) {
						visited[tempX][tempY] = true;
						queueX.add(tempX);
						queueY.add(tempY);
					}
				}
			}
		}
		
	}
}
