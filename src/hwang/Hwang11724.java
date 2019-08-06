package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang11724 {
	
    private static int visit[];
    private static int [][]graph;
    private static int N, M;
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	visit = new int[N+1];
    	graph = new int[N+1][N+1];
    	
    	for(int i = 0; i < M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		// 무방향 간선
    		graph[x][y] = graph[y][x] = 1;
    	}
    	
    	// cc 갯수
    	int cnt = 0;
    	for(int i = 1; i <= N; i++) {
    		if(visit[i] == 0) {
    			cnt++;
    			dfs(i);
    		}
    	}
    	System.out.println(cnt);
    }
    
    private static void dfs(int node) {
    	visit[node] = 1;
    	
    	for(int i = 1; i <= N; i++) {
    		if(graph[node][i] == 1 && visit[i] == 0) {
    			dfs(i);
    		}
    	}
    }
}
