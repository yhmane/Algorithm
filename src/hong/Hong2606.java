package hong;
/*
https://www.acmicpc.net/problem/2606
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2606 {
	static int[][] graph;
	static boolean[] visited;
	static int N;
	static int startPoint = 1;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		graph = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		dfs(startPoint);
		
		System.out.println(ans);
	}
	
	private static void dfs(int nodeNum) {
		visited[nodeNum] = true;
		
		for (int i = 1; i < N + 1; i++) {
			if (graph[nodeNum][i] == 1 && visited[i] == false) {
				dfs(i);
				ans++;
			}
		}
	}
}
