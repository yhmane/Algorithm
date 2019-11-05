// https://mattlee.tistory.com/50

package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1261 {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] distance = new int[n][m];
		int[][][] wallInfo = new int[n][m][1];
		
		int[][] map = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			char[] row = br.readLine().toCharArray();
			
			for(int j = 0; j < m; j++) {
				map[i][j] = row[j] - 48;
			}
		}
	}
}
