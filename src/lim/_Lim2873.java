package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim2873 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean[][] visit = new boolean[r][c];
		StringBuffer sb = new StringBuffer();
		
		int min = Integer.MAX_VALUE;
		int minI = 0;
		int minJ = 1;

		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < c; j++) {
				int score = Integer.parseInt(st.nextToken());
				
				if((i + j) % 2 == 1 && min > score) {
					min = score;
					minI = i;
					minJ = j;
				}
			}
		}
		
		if(r % 2 == 0 && c % 2 == 0) {			
			visit[minI][minJ] = true;
			visit[0][0] = true;
			int i = 0;
			int j = 0;
			
			while(i != r - 1 || j != c - 1) {
				
				if(i - 1 >= 0 && !visit[i - 1][j]) {
					i--;
					visit[i][j] = true;
					sb.append("U");
					continue;
				}
				
				
				if(j - 1 >= 0 && !visit[i][j - 1]) {
					j--;
					visit[i][j] = true;
					sb.append("L");
					continue;
				}
				
				if(j + 1 < c && !visit[i][j + 1]) {
					j++;
					visit[i][j] = true;
					sb.append("R");
					continue;
				}
			
				if(i + 1 < r && !visit[i + 1][j]) {
					i++;
					visit[i][j] = true;
					sb.append("D");
					continue;
				}
			}
		} else {
			
			if(r % 2 == 1) {
				
				for(int i = 0; i < r - 1; i++) {
					
					for(int j = 0; j < c - 1; j++) {
						
						if(i % 2 == 0) {
							sb.append("R");
						} else {
							sb.append("L");
						}
					}
					
					sb.append("D");
				}
				
				for(int j = 0; j < c - 1; j++) {
					sb.append("R");
				}
			}
		}
		
		System.out.println(sb);
	}
}
