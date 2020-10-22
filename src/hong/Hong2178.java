package hong;
/*
https://www.acmicpc.net/problem/2178
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong2178 {
	static int[][] graph;
	static boolean[][] visited;
	static int N;
	static int M;
	static int E;
	static int startPoint;
	static int[] dx = {0, 1, 0, -1}; //상하좌우
	static int[] dy = {1, 0, -1, 0};

	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String tempStr = br.readLine();
			for (int j = 0; j < M; j++) {
				graph[i][j] = (int)tempStr.charAt(j) - '0';
			}
		}
		
		bfs();
		System.out.println(graph[N - 1][M - 1]);
		
	}
	
	private static void bfs() {
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();
		
		queueX.add(0);
		queueY.add(0);
		
		visited[0][0] = true;
		
		while (!queueX.isEmpty()) {
			int x = queueX.poll();
			int y = queueY.poll();
			
			//상하좌우 확인
			for (int i = 0; i < 4; i++) {
				int tempX = x + dx[i];
				int tempY = y + dy[i];
				
				if (tempX >= 0 && tempY >=0 && tempX < N && tempY < M) {
					if (graph[tempX][tempY] == 1 && visited[tempX][tempY] == false) {
						queueX.add(tempX);
						queueY.add(tempY);
						
						visited[tempX][tempY] = true;
						
						graph[tempX][tempY] = graph[x][y] + 1;
					}
				}
			}
		}
		
	}
}
