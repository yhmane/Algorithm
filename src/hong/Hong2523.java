package hong;
/*
별 찍기 - 13
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
3
===================
*
**
***
**
*
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong2523 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 2 * N - 1; i++) {
			int tmp = i <= N ? i : 2 * N - i;
			for (int j = 0; j < tmp; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
