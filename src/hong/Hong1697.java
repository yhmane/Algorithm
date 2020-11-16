package hong;
/*
https://www.acmicpc.net/problem/1697
5 17 => 4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hong1697 {
	static int[] arr = new int[100001];
	static boolean[] visited = new boolean[100001];
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		visited[N] = true;
		
		if (N == K) {
			System.out.println(0);
		} else {
			bfs(N, K);
			System.out.println(arr[K]);
		}
		
	}
	
	public static void bfs(int start, int end) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		
		while (!q.isEmpty()) {
			int temp = q.poll();
			
			if (temp == end) {
				break;
			}
			
			// *2, -1, +1
			for (int i = 0; i < 3; i++) {
				int nextNumber;
				
				if (i == 0) {
					nextNumber = temp * 2;
				} else if (i == 1) {
					nextNumber = temp + 1;
				} else {
					nextNumber = temp - 1;
				}
				
				if (nextNumber >= 0 && nextNumber <= 100000 && !visited[nextNumber]) {
					visited[nextNumber] = true;
					arr[nextNumber] = arr[temp] + 1;
					q.offer(nextNumber);
				}
			}
		}
	}
}
