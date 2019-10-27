package hong;
/*
DFS와 BFS
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
4 5 1
1 2
1 3
1 4
2 4
3 4
======================
1 2 4 3
1 2 3 4
-------------------------
5 5 3
5 4
5 2
1 2
3 4
3 1
========================
3 1 2 5 4
3 1 4 2 5
-------------------------
1000 1 1000
999 1000
====================
1000 999
1000 999
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong1260 {
	
	static int[][] graph;
	static boolean visited[];
	static int N;
	static int E;
	static int startPoint;
	
	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		
		for (int j = 1; j <= N; j++) {
			if (graph[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");
		
		int temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			for(int j = 0; j < N + 1; j++) {
				if (graph[temp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		graph = new int[1001][1001];
		E =  Integer.parseInt(st.nextToken());
		visited = new boolean[10001];
		startPoint = Integer.parseInt(st.nextToken());
		
		int a, b;
		for (int i = 1; i <= E; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		dfs(startPoint);
		
		for (int j = 1; j <= N; j++) {
			visited[j] = false;
		}
		System.out.println();
		
		bfs(startPoint);
		
	}
}
