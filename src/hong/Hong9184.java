package hong;
/*
https://www.acmicpc.net/problem/9184
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong9184 {
	static int[][][] arr = new int[21][21][21];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		getAnswer();

		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = ");
			if (a <= 0 || b <= 0 || c <= 0) {
				sb.append(1).append("\n");
			} else if (a > 20 || b > 20 || c > 20) {
				sb.append(arr[20][20][20]).append("\n");
			} else {
				sb.append(arr[a][b][c]).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void getAnswer() {
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
				for (int k = 0; k <= 20; k++) {
					if (i < 1 || j < 1 || k < 1) {
						arr[i][j][k] = 1;
					} else {
						if (i < j && j < k) {
							arr[i][j][k] = arr[i][j][k - 1] + arr[i][j - 1][k - 1] - arr[i][j - 1][k];
						} else {
							arr[i][j][k] = arr[i - 1][j][k] + arr[i - 1][j - 1][k] + arr[i - 1][j][k - 1] - arr[i - 1][j - 1][k - 1];
						}
					}
				}
			}
		}
	}
}
