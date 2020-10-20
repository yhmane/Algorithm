package hong;
/*
행렬 곱셈
N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.
첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 그 다음 줄에는 행렬 B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. N과 M, 그리고 K는 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
================
-1 -2 6
-3 -6 12
-5 -10 18
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2740 {
	private static StringTokenizer st;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M1 = Integer.parseInt(st.nextToken());
		
		int[][] mat1 = getMatrix(N, M1);
		
		st = new StringTokenizer(br.readLine());
		
		int M2 = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] mat2 = getMatrix(M2, K);
		
		solve(mat1, mat2, N, M1, K);
	}
	
	private static int[][] getMatrix(int N, int M) throws Exception {
		int[][] mat = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		return mat;
	}
	
	private static void solve (int[][] mat1, int[][] mat2, int N, int M, int K) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				int sum = 0;
				for (int l = 0; l < M; l++) {
					sum += mat1[i][l] * mat2[l][j];
				}
				sb.append(sum).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
