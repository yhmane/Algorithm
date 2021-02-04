package hong;
/*
https://www.acmicpc.net/problem/11724
dfs
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11724_2 {
	static int N;
	static int M;
	static int[][] graph;
	static boolean[] visited;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		
		for (int i = 1; i <= N && M > 0; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		
		for (int i = 1; i <= N; i++) {
			if (graph[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
