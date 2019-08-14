package hwang;

import java.util.*;
import java.io.*;

public class Hwang9466 {

	private static int[] graph;
	private static int count = 0;
	private static boolean[] visited;
	private static boolean[] finished;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			
			int N = Integer.parseInt(br.readLine());
			graph = new int[N + 1];
			visited = new boolean[N + 1];
			finished = new boolean[N + 1];
			count = 0;

			st = new StringTokenizer(br.readLine());
			for(int i = 1; i<= N; i++) {
				graph[i] = Integer.parseInt(st.nextToken());
			}

			for(int i = 1; i<= N; i++) {
				dfs(i);
			}
 
			System.out.println(N - count);
		}
	}
 
	private static void dfs(int now) { 

		if(visited[now]) {
			return;
		}
 
		visited[now] = true;
		int next = graph[now];
 
		if(!visited[next]) {
			dfs(next);
		} else {
			if(!finished[next]) {
				count++;
				for(int i=next; i != now; i = graph[i]) {
					count++;
				}
			}
		}
 
		finished[now] = true;
	}
}
