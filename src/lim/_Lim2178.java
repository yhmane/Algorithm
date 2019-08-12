package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim2178 {
	private static int[] dx = {1, 0, -1, 0};
	private static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		boolean[][] maze = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < m; j++) {
				
				if(input.charAt(j) == '1') {
					maze[i][j] = true;
				}
			}
		}
		
		
	}
}
