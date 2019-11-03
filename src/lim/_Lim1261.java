package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1261 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int M = Integer.parseInt(st.nextToken());
		final int N = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			char[] row = br.readLine().toCharArray();
			
			for(int j = 0; j < M; j++) {
				map[i][j] = row[j] - 48;
			}
		}		
	}
}
